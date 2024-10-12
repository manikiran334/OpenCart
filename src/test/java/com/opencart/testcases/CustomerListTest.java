package com.opencart.testcases;

import com.opencart.pages.*;
import com.opencart.utilities.ReadExcelFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CustomerListTest extends BaseTest {

    String fileName = System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
@Test
    void CustomerListTest() {


    LoginPage li = new LoginPage(driver);
    String username = ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 0);
    String password = ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 1);
    li.loginPortel(username, password);

    CustomerPage cl = new CustomerPage();
    cl.CustomerPage(driver);

    CustomersNoOfPages cn = new CustomersNoOfPages();
    cn.customersNoOfPages(driver);

    LogOutPage lo = new LogOutPage();
    lo.logOut(driver);

}
}
