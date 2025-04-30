package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.get("https://www.saucedemo.com/");
    }
}