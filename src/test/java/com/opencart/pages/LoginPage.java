package com.opencart.pages;

import com.opencart.utilities.ReadExcelFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver Driver)
    {
        this.driver=Driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id=\"input-username\"]") WebElement uname;
    @FindBy(xpath = "//input[@id=\"input-password\"]") WebElement pass;
    @FindBy(xpath = "//button[@type=\"submit\"]") WebElement loginButton;
public void loginPortel(String username,String password)
    {
        uname.clear();
        pass.clear();
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }

}
