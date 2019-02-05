import com.princetonreview.CartPage;
import com.princetonreview.LSAT_In_Person_Page;
import com.princetonreview.NavigationPage;
import com.princetonreview.SignInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import util.RDriver;

public class CartTest extends RDriver{

    @Test
    public void addLSATCourseToCart()  {

        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();

        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com","myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnLSatInPerson();
        LSAT_In_Person_Page.enrollInMostPopularCourse();
        Assert.assertEquals("LSAT ULTIMATE 84-HOUR LIVEONLINE", driver.findElement(By.xpath("/html/body/div[6]/form/div/div[1]/div[2]/div/div[1]/h3")).getText());

    }
    @Test
    public void removeItemFromCart() throws Exception{
        driver.get(url);
        driver.manage().window().maximize();
        NavigationPage.clickSignIn();

        SignInPage.enterLogInInformation("bronx.lasko123@gmail.com","myPrinceton123");
        SignInPage.clickSignInButton();
        NavigationPage.clickOnLSatInPerson();
        LSAT_In_Person_Page.enrollInMostPopularCourse();
        CartPage.removeItemFromCart();
       Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[6]/form/div/div[1]/div[2]/div/div[1]/h3")).isDisplayed());

    }
}
