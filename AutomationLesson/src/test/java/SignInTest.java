import com.princetonreview.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.RDriver;
import util.Wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignInTest extends RDriver{



    @Test
    public void signInTest(){

        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();

        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com","myPrinceton123");
        SignInPage.clickSignInButton();

        Assert.assertEquals(true,driver.findElement(By.cssSelector("body > div.container.main-container > div.page-header")).isDisplayed());
    }
    @Test
    public void lSATCourseTest(){
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com","myPrinceton123");
        SignInPage.clickSignInButton();
        AcountPage.openACourse("GMAT Free Practice Test");
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[1]/div[1]/h2")).isDisplayed());
    }

}
