package com.princetonreview;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.RDriver;

public class LSAT_In_Person_Page extends RDriver{

    public static void enterStartDate(String startDate){

        driver.findElement(By.cssSelector("#TestDate")).click();
        driver.findElement(By.cssSelector("#TestDate")).sendKeys(startDate);

    }
    public static void enterClassStartDate(String classStartDate){

        driver.findElement(By.cssSelector("#StartDate")).click();
        driver.findElement(By.cssSelector("#StartDate")).sendKeys(classStartDate);

    }
    public static void enterClassEndDate(String endDate){

        driver.findElement(By.cssSelector("#EndDate")).click();
        driver.findElement(By.cssSelector("#EndDate")).sendKeys(endDate);

    }
    public static void enterZipCode(String zipCode){

        driver.findElement(By.cssSelector("#z")).click();
        driver.findElement(By.cssSelector("#z")).sendKeys(zipCode);

    }
    public static void enrollInMostPopularCourse(){
        driver.findElement(By.xpath("//*[@id=\"Facility-0\"]/div[2]/div[1]/div[3]/div/div[4]/a[2]")).click();

    }

}
