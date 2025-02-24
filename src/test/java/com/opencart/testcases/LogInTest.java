package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.LoginPage;
import com.opencart.utilities.ReadExcelFile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {


    String fileName = System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
    @Test(priority = 1,dataProvider = "LoginDataProvider")
         void VerifyLogin(String username, String password) {
        LoginPage lp = new LoginPage(driver);
       // String user = "demoadmin";
        //String pass = "demopass";
        lp.loginPortel(username, password);

    }
    @DataProvider(name = "LoginDataProvider")
        public String[][] LoginDataProvider ()
        {
            int ttlRows = ReadExcelFile.getRowCount(fileName, "Sheet1");
            int ttlColumns = ReadExcelFile.getColCount(fileName, "Sheet1");

            String data[][] = new String[ttlRows - 1][ttlColumns];

            for (int i = 1; i < ttlRows; i++) {
                for (int j = 0; j < ttlColumns; j++) {
                    data[i - 1][j] = ReadExcelFile.getCellValue(fileName, "Sheet1", i, j);
                }
            }
            return data;

        }


    }


