package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends  RDriver{


    public static void sleep(int seconds)  {

        try {
            int mill = seconds *1000;
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitForSignUptoDisplay(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));
    }
    public static void waitForGraduatePrepSubListToDisplay(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"desktopnav\"]/header/nav/div/div[2]/ul[1]/li[2]/div/div/div/div[1]/div/div[6]/ul/li[2]/a")));
    }

    public static void waitForPasswordToDisplay(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
    }
    public static void waitUntilElementIsDisplay(String locator, String word){

        WebDriverWait wait = new WebDriverWait(driver,10);

        if (locator.equalsIgnoreCase("xpath")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(word)));
        }
        else if (locator.equalsIgnoreCase("name")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(word)));
        }
        else if (locator.equalsIgnoreCase("id")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(word)));
        }
        else if (locator.equalsIgnoreCase("linktext")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(word)));
        }
        else if (locator.equalsIgnoreCase("cssSelector")){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(word)));
        }
    }


}
