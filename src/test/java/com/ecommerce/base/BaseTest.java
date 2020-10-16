package com.ecommerce.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static  WebDriver driver;
    public static Properties property;
    public  static EventFiringWebDriver e_driver;
    private String url;
    private String browser;
    private String implicitTimeout;
    private String pageLoadTimeout;



    public BaseTest( )
    {
        // Initializing page objects
        //this.driver=driver;
        //PageFactory.initElements(driver, this);

        // Loading properties
        try {
            property = new Properties();
            FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config/config.properties");
            property.load(stream);
            browser = property.getProperty("browser");
            url = property.getProperty("url");
            implicitTimeout = property.getProperty("implicitTimeout");
            pageLoadTimeout = property.getProperty("pageLoadTimeout");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void setup()
    {

        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Long.parseLong(pageLoadTimeout), TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitTimeout), TimeUnit.SECONDS);
        driver.get(url);

    }

    public void tearDown()
    {
        driver.quit();
    }
}
