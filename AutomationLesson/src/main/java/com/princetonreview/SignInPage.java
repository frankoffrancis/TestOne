package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;

public class SignInPage extends RDriver{

    public static void enterLogInInformation(String username, String password){
        driver.switchTo().frame("actionFrame");
        // username
        driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys(username);
        // password
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
    }
    public static void clickSignInButton(){
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
