package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * All Menu (Seven menu), LoginLink, registerLink,
 * nopcommerce logo, My account link and LogOut link locatores
 */
public class HomePage extends Utility {
 private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(), 'Computers ')]")
    WebElement computerLink;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutText;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    public String verifyLogoutLinkDisplay() {
        String message = getTextFromElement(logOutText);
        log.info("Get logout link" + logOutText.toString());
        return message;
    }

    public String verifyLogInLinkDisplay() {
        String message = getTextFromElement(loginLink);
        return message;

    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                log.info("Clicking on menu tab : " + topMenuList.toString());
                break;
            }
        }
    }
    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
        log.info("Clicking on logout link" + logOutButton.toString());

    }

}

