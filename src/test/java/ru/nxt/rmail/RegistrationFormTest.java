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
                .setTel(tel)
                .setSubjects(subject)
                .setAdress(adress)
                .setGender(gender)
                .setState(state)
                .setCity(city)
                .setDateOfBirth(date,month,year)
                .setFilename(fileName)
                .setHobbie(hobbie)
                .clickSubmit();

//Проверка таблицы с результатами
        registrationFormPage
                .checkSubmitting()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Mobile",tel)
                .checkResult("Gender",gender)
                .checkResult("Date of Birth",date+" "+month+","+year)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobbie)
                .checkResult("Picture",fileName)
                .checkResult("Address", adress)
                .checkResult("State and City",state+" "+city);

    }}