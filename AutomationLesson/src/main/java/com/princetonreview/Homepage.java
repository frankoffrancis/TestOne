package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;

public class Homepage extends RDriver{

    public static void clickSignUp(){

        driver.findElement(By.linkText("Sign In"));
    }
}
