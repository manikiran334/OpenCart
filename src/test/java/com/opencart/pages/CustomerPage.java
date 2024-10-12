package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {
    WebDriver driver;
    WebElement customerbtn= driver.findElement(By.xpath("//li[@id='menu-customer']"));
    WebElement customersbtn=driver.findElement(By.linkText("Customers"));
    public void CustomerPage(WebDriver driver)
    {
        customerbtn.click();
        customersbtn.click();
    }

}
