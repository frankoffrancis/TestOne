package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;

public class Free_LSAT_Page extends RDriver {


    public static void enterTestDate (String testDate){
        driver.findElement(By.id("TestDate")).click();
        driver.findElement(By.id("TestDate")).sendKeys(testDate);

    }
    public static void enterClassStartDate (String startDate){
        driver.findElement(By.id("StartDate")).click();
        driver.findElement(By.id("StartDate")).sendKeys(startDate);

    }
    public static void enterClassEndDate (String endDate){
        driver.findElement(By.id("EndDate")).click();
        driver.findElement(By.id("EndDate")).sendKeys(endDate);

    }

    public static void enterZipCode (String zipCode){
        driver.findElement(By.id("z")).click();
        driver.findElement(By.id("z")).sendKeys(zipCode);

    }

    public static void clickOnFreeLSATPraticeOnline (){

        driver.findElement(By.xpath("//*[@id=\"Facility-0\"]/div[2]/div/div[2]/div/div[4]/a")).click();

    }
}
