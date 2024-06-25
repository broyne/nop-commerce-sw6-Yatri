package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 *  Register Text, male female radio, Firstname, lastname, Date of Birth drop down, email,
 * Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
 * "Email is required.","Password is required.", "Password is required." error message, "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequiredText;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequiredText;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequiredText;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement passwordRequiredText;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadioButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement fistName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'result']")
    WebElement registrationCompleteText;

    public String verifyRegistrationCompleteTextDisplay() {
        String message = getTextFromElement(registrationCompleteText);
        log.info("Registration complete text display" + registrationCompleteText.toString());
        return message;

    }

    public void enterEmail(String email_Id) {
        sendTextToElement(email, email_Id);
       log.info("Enter emailId " + email_Id);

    }

    public void enterPassword(String password_field) {
        sendTextToElement(password, password_field);
        log.info("Enter password " + password_field);

    }

    public void enterConfirmPassword(String confirm_password_field) {
        sendTextToElement(confirmPassword, confirm_password_field);
        log.info("Enter confirm password " + confirm_password_field);

    }

    public void enterDay(String date) {
        sendTextToElement(day, date);
        log.info("Enter date " + date);

    }

    public void enterMonth(String month_) {
        sendTextToElement(month, month_);
        log.info("Enter month " + month_);

    }

    public void enterYear(String year_) {
        sendTextToElement(year, year_);
        log.info("Enter year " + year_);

    }

    public void enterFirstName(String first_Name) {
        sendTextToElement(fistName, first_Name);
        log.info("Enter First Name " + first_Name);

    }

    public void enterLastName(String last_Name) {
        sendTextToElement(lastName, last_Name);
        log.info("Enter Last Name " + last_Name);

    }


    public void clickOnFemaleRadioButton() {
        clickOnElement(femaleRadioButton);
        log.info("Clicking on female radio button" + femaleRadioButton.toString());

    }


    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on register link" + registerButton.toString());

    }

    public String verifyFirstNameRequiredTextDisplay() {
        String message = getTextFromElement(firstNameRequiredText);
        log.info("Get first name required text display" + firstNameRequiredText.toString());
        return message;

    }

    public String verifyLastNameRequiredTextDisplay() {
        String message = getTextFromElement(lastNameRequiredText);
        log.info("Get last name required text display" + lastNameRequiredText.toString());
        return message;

    }

    public String verifyEmailRequiredTextDisplay() {
        String message = getTextFromElement(emailRequiredText);
        log.info("Get Email required text display" + emailRequiredText.toString());
        return message;

    }

    public String verifyPasswordRequiredTextDisplay() {
        String message = getTextFromElement(passwordRequiredText);
        log.info("Get password required text display" + passwordRequiredText.toString());
        return message;

    }

    public String verifyRegisterTextDisplay() {
        String message = getTextFromElement(registerText);
        log.info("Get register text" + registerText.toString());
        return message;

    }
}
