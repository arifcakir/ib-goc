package com.selenium.JUnit;

import org.junit.jupiter.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1_Test {
    public void hepsiburadaTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        System.out.println("Page Title: "+ driver.getTitle());
        driver.close();
    }

    public void amazonTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        System.out.println("Page Title: "+ driver.getTitle());
        driver.close();
    }
}
