package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerStep {
    @When("I click on menu {string}")
    public void iClickOnMenu(String tab) {
        new HomePage().clickOnMenuTab(tab);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String computerText) {
        Assert.assertEquals(new ComputerPage().verifyComputerText(),computerText,"Computer text not display");
    }


    @When("I mouse over to computer and click on desktop")
    public void iMouseOverToComputerAndClickOnDesktop() {
        new ComputerPage().mouseOverToComputerAndClickOnDesktop();
    }

    @Then("I should see the text as {string}")
    public void iShouldSeeTheTextAs(String desktopText) {
        Assert.assertEquals(new DesktopPage().verifyDesktopText(),desktopText,"Desktop text not display");
    }

    @And("I click on build your computer product")
    public void iClickOnBuildYourComputerProduct() {
        new DesktopPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select ram{string}")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select hdd {string}")
    public void iSelectHdd(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select os {string}")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectCheckBox(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCArtButton();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String addedOnCartSuccessText) {
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyProductAddToCartSuccessfully(),addedOnCartSuccessText,"product added successfully text not display");
    }
}
