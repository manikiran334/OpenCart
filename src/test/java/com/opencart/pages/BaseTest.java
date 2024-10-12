package com.opencart.pages;




import java.io.File;
import java.io.IOException;

import com.opencart.utilities.BrowserFactory;
import com.opencart.utilities.ConfigDataProvider;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;




public class BaseTest {
    public WebDriver driver;
    public ConfigDataProvider config = new ConfigDataProvider();


   @BeforeClass
    public  void setUp(){
       driver= BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());

   }
    @AfterClass
    public void tearDown()
    {
        BrowserFactory.quitBrowser(driver);

    }
    public void captureScreenShot(WebDriver driver,String testName) throws IOException
    {

        TakesScreenshot screenshot= ((TakesScreenshot)driver);



        File src= screenshot.getScreenshotAs(OutputType.FILE);
        File srcpath=new File("."+"//Screenshots//"+ testName + ".png");

        FileUtils.copyFile(src, srcpath);

    }

}

