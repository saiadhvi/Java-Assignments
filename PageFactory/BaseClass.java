package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

    public class BaseClass {

        WebDriver driver;

        @BeforeMethod
        public void launchBrowser() {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
            driver = new ChromeDriver();
            driver.get("http://spree-vapasi-prod.herokuapp.com/login");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        
        @AfterMethod
        public void quitBrowser()
        {

            driver.quit();
        }

    }
