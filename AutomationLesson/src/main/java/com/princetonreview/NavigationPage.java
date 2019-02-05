package com.princetonreview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import util.RDriver;
import util.Wait;

public class NavigationPage extends RDriver{


  public static void clickOnLSatFreeTest(){

      Actions builder = new Actions(driver);
      builder.moveToElement(driver.findElement(By.linkText("Graduate Prep"))).perform();
      Wait.waitForGraduatePrepSubListToDisplay();
      driver.findElement(By.xpath("//*[@id=\"desktopnav\"]/header/nav/div/div[2]/ul[1]/li[2]/div/div/div/div[1]/div/div[2]/ul/li[5]/a")).click();

    }
    public  static void clickSignIn(){

      driver.findElement(By.linkText("Sign In")).click();
      Wait.waitForSignUptoDisplay();
    }

    public static void clickOnLSatInPerson(){

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.linkText("Graduate Prep"))).perform();
        Wait.waitForGraduatePrepSubListToDisplay();
        driver.findElement(By.xpath("//*[@id=\"desktopnav\"]/header/nav/div/div[2]/ul[1]/li[2]/div/div/div/div[1]/div/div[2]/ul/li[2]/a")).click();
    }

        public static void enrollInMostPopularLSATUlitmateOnlineCourse(){

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.linkText("Graduate Prep"))).perform();
        Wait.waitForGraduatePrepSubListToDisplay();
        driver.findElement(By.xpath("//*[@id=\"desktopnav\"]/header/nav/div/div[2]/ul[1]/li[2]/div/div/div/div[1]/div/div[2]/ul/li[2]/a")).click();
    }
   public static void clickOnCart(){
            driver.findElement(By.cssSelector("#desktopnav > header > nav > div > div:nth-child(2) > ul.nav.navbar-nav.navbar-right > li:nth-child(3) > a"));
   }

   public static void clickOnACourceForSATHome(String course){

       Actions builder = new Actions(driver);
       builder.moveToElement(driver.findElement(By.linkText("College Prep"))).perform();
       Wait.waitUntilElementIsDisplay("linktext","SAT Home");
       driver.findElement(By.linkText(course)).click();

   }
}
