package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;

public class CartPage extends RDriver {

    public static void removeItemFromCart() throws Exception{

        driver.findElement(By.linkText("Remove")).click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("body > div.modal.fade.modalConfirm.in > div > div > div.modal-footer.modalConfirm-actions > div > div:nth-child(2) > button")));
        Thread.sleep(10000);
        driver.findElement(By.linkText("OK")).click();

    }
    public static void clickOnCart(){
        driver.findElement(By.cssSelector("#desktopnav > header > nav > div > div:nth-child(2) > ul.nav.navbar-nav.navbar-right > li:nth-child(3) > a")).click();

    }

}
