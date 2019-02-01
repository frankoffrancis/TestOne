package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RDriver extends GlobalFunctions{

    protected  static WebDriver driver;

    public static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Before
    public void setUp(){
        setEnvironment();
        setUpDriver();

    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
