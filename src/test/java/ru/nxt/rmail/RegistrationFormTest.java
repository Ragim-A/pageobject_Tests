package ru.nxt.rmail;

import Pages.RegistrationFormPage;
import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationFormTest extends TestBase{



    @Test
    void successfulTest() {
        String firstName = "Vova";
        String lastName = "Kotov";
        String Gender = "Male";
        String email = "vova@kotov.com";
        String Tel = "8910313333";
        String Subject = "Maths";
        String Hobbie = "Sports";
        String Adress = "Some street 1";
        String State = "NCR";
        String City = "Delhi";

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
                .setHobbie(Hobbie);


//        $("#firstName").setValue(firstName);
//        $("#lastName").setValue(lastName);
//        $("#userEmail").setValue(email);
//        $("#genterWrapper").$(byText("Male")).click();
//        $("#userNumber").setValue(Tel);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
//        $("#subjectsInput").sendKeys("Maths");
//        $("#subjectsInput").pressEnter();
//        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
//        $("#currentAddress").setValue("Some street 1");
//        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//        $("#city").click();
//        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        $(".table-responsive").shouldHave(text(firstName), text(lastName), text(email), text(Tel),
                text("Male"), text("Maths"), text("Sports"), text("Some street 1"),
                text("30 May,2000"), text ("NCR"), text("Delhi"));
}}
