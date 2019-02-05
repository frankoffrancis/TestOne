package com.princetonreview;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import util.RDriver;

public class SATUlitmatePage extends RDriver{


    public static void enterTestDate (String testDate){
        Select dropDown = new Select(driver.findElement(By.id("TestDate")));
        dropDown.selectByVisibleText(testDate);

    }
    public static void enterClassStartDate (String startDate){
        driver.findElement(By.id("StartDate")).clear();
        driver.findElement(By.id("StartDate")).click();
        driver.findElement(By.id("StartDate")).sendKeys(startDate);

    }
    public static void enterClassEndDate (String endDate){
        driver.findElement(By.id("EndDate")).clear();
        driver.findElement(By.id("EndDate")).click();
        driver.findElement(By.id("EndDate")).sendKeys(endDate);

    }

    public static void enterZipCode (String zipCode){
        driver.findElement(By.id("z")).clear();
        driver.findElement(By.id("z")).click();
        driver.findElement(By.id("z")).sendKeys(zipCode);
        driver.findElement(By.id("z")).submit();

    }
    public static void enrollInACourse(){
        driver.findElement(By.xpath("//*[@id=\"Facility-728\"]/div[2]/div[1]/div[2]/div/div[4]/a[2]")).click();
    }
}
