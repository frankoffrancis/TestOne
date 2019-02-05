import com.google.common.base.Verify;
import com.princetonreview.NavigationPage;
import com.princetonreview.SATUlitmatePage;
import com.princetonreview.SignInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import util.RDriver;
import util.Wait;

public class SAT_Test extends RDriver {

    @Test
    public void verifySATUltimatePage(){
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnACourceForSATHome("Ultimate Course");
        Assert.assertTrue(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > div.hero-details-sat")).isDisplayed());
    }
    @Test
    public void verifySATUltimateExclusiveToolsIsDisplayed(){
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnACourceForSATHome("Ultimate Course");
        Verify.verify(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > main > section.container.exclusive-tab > div.hidden-xs > ul > li.active > a")).isDisplayed());
        Verify.verify(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > main > section.container.exclusive-tab > div.hidden-xs > ul > li:nth-child(2) > a")).isDisplayed());
        Verify.verify(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > main > section.container.exclusive-tab > div.hidden-xs > ul > li:nth-child(3) > a")).isDisplayed());
        Verify.verify(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > main > section.container.exclusive-tab > div.hidden-xs > ul > li:nth-child(4) > a")).isDisplayed());
        Verify.verify(driver.findElement(By.cssSelector("#mainContentCol > div:nth-child(4) > main > section.container.exclusive-tab > div.hidden-xs > ul > li:nth-child(5) > a")).isDisplayed());

    }
    @Test
    public void verifySearchingForAnSATUltimateCourse(){
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnACourceForSATHome("Ultimate Course");
        SATUlitmatePage.enterTestDate("5/4/2019");
        Wait.sleep(5);
        SATUlitmatePage.enterClassStartDate("03/01/2019");
        Wait.sleep(5);
        SATUlitmatePage.enterClassEndDate("05/03/2019");
        SATUlitmatePage.enterZipCode("11236");
        Wait.waitUntilElementIsDisplay("cssselector","#Facility-728 > div.offerings.init-list.no-more.listcount4.no-productdescription > div:nth-child(1) > div.offering");
        Assert.assertTrue(driver.findElement(By.cssSelector("#Facility-728 > div.offerings.init-list.no-more.listcount4.no-productdescription > div:nth-child(1) > div.offering")).isDisplayed());
    }
    @Test
    public void verifyEnrollingInAnSATUltimateCorse(){
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnACourceForSATHome("Ultimate Course");
        SATUlitmatePage.enterTestDate("5/4/2019");
        Wait.sleep(5);
        SATUlitmatePage.enterClassStartDate("03/01/2019");
        Wait.sleep(5);
        SATUlitmatePage.enterClassEndDate("05/03/2019");
        SATUlitmatePage.enterZipCode("11236");
        Wait.waitUntilElementIsDisplay("cssselector","#Facility-728 > div.offerings.init-list.no-more.listcount4.no-productdescription > div:nth-child(1) > div.offering");
        SATUlitmatePage.enrollInACourse();
        Assert.assertTrue(driver.findElement(By.cssSelector("body > div.container.main-container > form > div > div.col-lg-7.col-md-7 > div:nth-child(4) > div > div.col-sm-8.col-xs-7")).isDisplayed());
    }

}
