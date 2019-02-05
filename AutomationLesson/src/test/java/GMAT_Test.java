import com.google.common.base.Verify;
import com.princetonreview.AcountPage;
import com.princetonreview.GMAT_Prep_Free_Page;
import com.princetonreview.NavigationPage;
import com.princetonreview.SignInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.RDriver;
import util.Wait;

public class GMAT_Test extends RDriver {


    @Test
    public void verifyGMATFreePrepHomePage() {
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        AcountPage.openACourse("GMAT Free Practice Test");

        Assert.assertEquals("GMAT Prep Free Trial", driver.findElement(By.cssSelector("h2[aria-label='GMAT Prep Free Trial']")).getText());
    }

    @Test
    public void verifyParacticeTest() {
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        AcountPage.openACourse("GMAT Free Practice Test");
        GMAT_Prep_Free_Page.clickNavOption("Practice Tests");
        Assert.assertTrue(driver.findElement(By.id("exam-3117")).isDisplayed());
        //exam-3117
    }

    @Test
    public void verifyGMATPrepTest() {
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        AcountPage.openACourse("GMAT Free Practice Test");
        GMAT_Prep_Free_Page.clickNavOption("Practice Tests");
        Wait.waitUntilElementIsDisplay("cssselector", "#content-object-5713 > li > a");
        GMAT_Prep_Free_Page.clickOnGMATSeven();
        Wait.sleep(10);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div")).isDisplayed());
    }

    @Test
    public void verifyGMATCourseWork() {
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();
        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com", "myPrinceton123");
        SignInPage.clickSignInButton();
        AcountPage.openACourse("GMAT Free Practice Test");
        GMAT_Prep_Free_Page.clickNavOption("Coursework");
        Verify.verify(driver.findElement(By.cssSelector("#side-nav > li.panel.active > a")).isDisplayed());
        Wait.sleep(5);
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div[1]/div[2]/ul/li[11]/div/div/div[1]")).click();
        GMAT_Prep_Free_Page.selectALessonInPiecesOfThePuzzle("Pieces of the Puzzle Adaptive Lesson");
        Wait.sleep(5);
        driver.switchTo().frame("content-frame");
      Assert.assertTrue(driver.findElement(By.cssSelector("#\\36 gY8VQBbKf7\\2e 6Xnz9Lu0Ljj\\2e 67s5ApFvd7U > canvas")).isDisplayed());

    }
}