package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.nopcommerce.demo.utility.Utility.getRandomString;

public class RegisterStep {

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }


    @Then("I should see the the text {string}")
    public void iShouldSeeTheTheText(String registerText) {
        Assert.assertEquals(new RegisterPage().verifyRegisterTextDisplay(), registerText, "register text not display");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @Then("I should see the first name text error {string}")
    public void iShouldSeeTheFirstNameTextError(String firstNameRequiredText) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameRequiredTextDisplay(), firstNameRequiredText, "Get first name required text not display");
    }

    @And("I should see the last name text error {string}")
    public void iShouldSeeTheLastNameTextError(String lastNameRequiredText) {
        Assert.assertEquals(new RegisterPage().verifyLastNameRequiredTextDisplay(), lastNameRequiredText, "Get last name required text not display");
    }

    @And("I should see the email required text error {string}")
    public void iShouldSeeTheEmailRequiredTextError(String emailRequiredText) {
        Assert.assertEquals(new RegisterPage().verifyEmailRequiredTextDisplay(), emailRequiredText, "Get email required text not display");
    }

    @And("I should see the password required text error {string}")
    public void iShouldSeeThePasswordRequiredTextError(String passwordRequiredText) {
        Assert.assertEquals(new RegisterPage().verifyPasswordRequiredTextDisplay(), passwordRequiredText, "Get password required text not display");
    }

    @And("I click on female radio button")
    public void iClickOnFemaleRadioButton() {
        new RegisterPage().clickOnFemaleRadioButton();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I enter day {string}")
    public void iEnterDay(String day) {
        new RegisterPage().enterDay(day);
    }

    @And("I enter month {string}")
    public void iEnterMonth(String month) {
        new RegisterPage().enterMonth(month);
    }

    @And("I enter year {string}")
    public void iEnterYear(String year) {
        new RegisterPage().enterYear(year);
    }

    @And("I enter email in email field {string}")
    public void iEnterEmailInEmailField(String email) {
        new RegisterPage().enterEmail(email);
    }



    @And("I enter password in password field {string}")
    public void iEnterPasswordInPasswordField(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password in confirm password field {string}")
    public void iEnterConfirmPasswordInConfirmPasswordField(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("User should see the success message {string}")
    public void userShouldSeeTheSuccessMessage(String registrationSuccessText) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompleteTextDisplay(), registrationSuccessText, "Registration complete text not display");
    }

    @And("i enter email in email field")
    public void iEnterEmailInEmailField() {
        String randomString = getRandomString(6);
        new RegisterPage().enterEmail("yatrihirani"+randomString+"@gmail.com");

    }
}