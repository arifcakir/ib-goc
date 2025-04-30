package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_WebDriver_Manage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();
        driver.manage().window().getSize();
        driver.manage().window().getPosition();

        driver.manage().window().setSize(new Dimension(1200,1080));
    }
}
