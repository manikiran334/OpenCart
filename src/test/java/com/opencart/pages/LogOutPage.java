package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LogOutPage {
    WebDriver driver;

    public void logOut(WebDriver Driver)
    {
        this.driver=Driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id=\"nav-logout\"]") WebElement logout;
    public void logout()
    {
        logout.click();
    }

}
