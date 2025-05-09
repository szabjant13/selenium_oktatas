package example;

import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ExampleTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "O:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void openGoogleTest(){
        driver.get("https://google.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }
}
