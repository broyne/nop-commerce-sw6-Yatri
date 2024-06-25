package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage, "Error message not display");
    }

    @Then("I should see the log out link {string} display")
    public void iShouldSeeTheLogOutLinkDisplay(String logoutLink) {
        Assert.assertEquals(new HomePage().verifyLogoutLinkDisplay(), logoutLink, "LogOut Link not display");
    }

    @And("I click on Logout button")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogOutButton();

    }

    @Then("I should see the log in link {string} display")
    public void iShouldSeeTheLogInLinkDisplay(String loginLink) {
        Assert.assertEquals(new HomePage().verifyLogInLinkDisplay(), loginLink, "Login Link not display");
    }
}
