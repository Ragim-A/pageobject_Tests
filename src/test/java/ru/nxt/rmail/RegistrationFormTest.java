package ru.nxt.rmail;

import org.junit.jupiter.api.Test;
import static ru.nxt.rmail.TestData.*;

public class RegistrationFormTest extends TestBase{
    @Test
    void successfulTest() {

//Заполнение формы
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setTel(Tel)
                .setSubjects(Subject)
                .setAdress(Adress)
                .setGender(Gender)
                .setState(State)
                .setCity(City)
                .setDateOfBirth(Date,Month,Year)
                .setFilename(FileName)
                .setHobbie(Hobbie)
                .clickSubmit();

//Проверка таблицы с результатами
        registrationFormPage
                .checkSubmitting()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Mobile",Tel)
                .checkResult("Gender",Gender)
                .checkResult("Date of Birth",Date+" "+Month+","+Year)
                .checkResult("Subjects", Subject)
                .checkResult("Hobbies", Hobbie)
                .checkResult("Picture",FileName)
                .checkResult("Address", Adress)
                .checkResult("State and City",State+" "+City);

    }}