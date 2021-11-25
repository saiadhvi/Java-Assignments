package org.example;
import PageFactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

    public class SpreeAssertcartPageFactory extends BaseClass {

        @Test
        public void assertCartValue() throws IOException {
            //Login
            LoginPage loginpage = new LoginPage (driver);
            loginpage.login("pep.jaya@gmail.com","saiadhvi");

            //Select Category
            CategoryPage category = new CategoryPage(driver);
            category.selectCategory();
            category.selectProduct();

            //select quantity and add to cart
            ProductPage product = new ProductPage(driver);
            product.addProducttocart();

            //Click Checkout in Cart Page
            CartPage cart =  new CartPage(driver);
            cart.clickCheckOut();

            //Enter Billing address in CheckoutPage
            CheckoutPage checkout = new CheckoutPage(driver);
            checkout.addBillingAddress("Jaya","lakshmi","IAF Road","Chennai","Alaska","56567","United States of America","87853673730");

            //Shipping method
            DeliveryPage dpage = new DeliveryPage(driver);
            dpage.addShipingMethod();

            //Select Payment option
            PaymentPage payment = new PaymentPage(driver);
            payment.selectPayment();

            //Order Complete page
            String orderStatusMessage=driver.findElement(By.cssSelector("div[class='alert alert-notice']")).getText();
            Assert.assertEquals(orderStatusMessage,"Your order has been processed successfully", "Order not Placed Successfully");

        }
    }
