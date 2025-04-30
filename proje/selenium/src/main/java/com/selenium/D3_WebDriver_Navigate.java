package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_WebDriver_Navigate {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.hepsiburada.com");
        driver.navigate().to("https://www.trendyol.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}
