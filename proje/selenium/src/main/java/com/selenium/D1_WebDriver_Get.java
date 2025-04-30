package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1_WebDriver_Get {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");

        System.out.println("Sayfa Title: " + driver.getTitle());
        System.out.println("Page url: " + driver.getCurrentUrl());

        System.out.println("------------------------------");
        driver.get("https://www.trendyol.com/");
        System.out.println("Sayfa Title: " + driver.getTitle());
        System.out.println("Page url: " + driver.getCurrentUrl());

        System.out.println("------------------------------");

        driver.get("https://www.amazon.com.tr/");
        System.out.println("Sayfa Title: " + driver.getTitle());
        System.out.println("Page url: " + driver.getCurrentUrl());

        driver.quit();
    }
}
