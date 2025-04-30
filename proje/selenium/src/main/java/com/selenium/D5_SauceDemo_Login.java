package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_SauceDemo_Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement username =  driver.findElement(By.id("user-name"));
        username.click();
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//*[@data-test='password']"));
        Thread.sleep(5000);
        password.click();
        password.clear();
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Thread.sleep(3000);
        loginButton.click();


    }
}
