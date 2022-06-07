package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    public RegistrationFormPage setFirstName(String value){
    $("#firstName").setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName (String value) {
    $("#lastName").setValue(value);
        return this;
    }

    public RegistrationFormPage setEmail (String value){
    $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationFormPage setTel (String value){
    $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationFormPage setSubjects (String value){
    $("#subjectsInput").sendKeys(value);
    $("#subjectsInput").pressEnter();
        return this;
    }

    public RegistrationFormPage setAdress(String value){
    $("#currentAddress").setValue("Some street 1");
        return this;
    }

    public RegistrationFormPage setGender(String value){
    $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setHobbie(String value){
    $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setState(String value){
    $("#state").click();
    $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setCity(String value){
    $("#city").click();
    $("#stateCity-wrapper").$(byText(value)).click();
    $("#submit").click();
        return this;
    }

}
