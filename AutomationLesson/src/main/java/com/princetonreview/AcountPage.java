package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;

public class AcountPage extends RDriver{

    public static void openACourse(String course){

        if(course.equalsIgnoreCase("LSAT Free Practice Test")){
            driver.findElement(By.cssSelector("button[aria-label='Open LSAT Free Practice Test']")).click();
        }
        else if(course.equalsIgnoreCase("GMAT Free Practice Test")){

            driver.findElement(By.cssSelector("button[aria-label='Open GMAT Prep Free Trial']")).click();
        }
        else if(course.equalsIgnoreCase("MCAT Free Practice Test")){
            driver.findElement(By.cssSelector("button[aria-label='Open MCAT Prep Free Trial']")).click();
        }
    }
}
