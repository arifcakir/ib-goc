package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_WebDriver_WebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        System.out.println("Page Title" + driver.getTitle());

        driver.manage().window().maximize();
        //WebElement searchBox= driver.findElement(By.id("twotabsearch"));
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys("Dell");
        //driver.findElement(By.id("nav-search-submit-button")).click();
        //WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
        searchBox.sendKeys(Keys.TAB);
       // driver.close();
        /*driver.findElement(By.id("twotabsearchtextbox"));
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");*/


        driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        driver.findElement(By.xpath("(//*[text()='Çok Satanlar'])[1]"));
    }
}
