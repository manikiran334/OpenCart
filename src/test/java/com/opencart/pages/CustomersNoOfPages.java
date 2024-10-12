package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomersNoOfPages {
    static WebDriver driver;
   public void customersNoOfPages(WebDriver driver) {
        String text= driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();

        int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1)) ;
        for (int p = 1; p <=total_pages ; p++)
        {
           if (p>1)
           {
               WebElement active_page =driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
               active_page.click();
           }

           int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

            for (int r =1 ; r <=noOfRows ; r++)
            {
            String customername= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
            String emailAdress=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
            String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
                System.out.println(customername+"\t"+emailAdress+"\t"+status);
            }

        }
    }
}
