package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Computers text, DesktopsLink, NotebooksLink,
 * SoftwareLink Locators and create appropriate methods for it.
 */
public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement softwareLink;

    public String verifyComputerText() {
        String message = getTextFromElement(computerText);
        log.info("Get computer text" + computerText.toString());
        return message;
    }

    public void mouseOverToComputerAndClickOnDesktop(){
        mouseHoverToElement(new HomePage().computerLink);
        mouseHoverToElementAndClick(desktopLink);
        log.info("Clicking on logout link" + desktopLink.toString());
    }
}
