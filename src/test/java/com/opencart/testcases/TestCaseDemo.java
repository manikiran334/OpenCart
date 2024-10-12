package com.opencart.testcases;


import com.opencart.pages.BaseTest;
import com.opencart.pages.LoginPage;
import com.opencart.utilities.ReadExcelFile;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseDemo extends BaseTest {

    @Test
    void verifyTest()
 {
     LoginPage lp = new LoginPage(driver);
      String username="demoadmin";
      String password="demopass";
      lp.loginPortel(username,password);
      driver.findElement(By.xpath("//li[@id='menu-customer']")).click();

      driver.findElement(By.linkText("Customers")).click();
 }

}

