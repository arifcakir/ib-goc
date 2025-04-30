package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D8_Selenium_Assertion {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        String expectedTitle = "test Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        String actualTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        System.out.println("Page Title: " + driver.getTitle());

        driver.manage().window().maximize();

        //String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)){
            System.out.println("Doğrulama Başarılı.");
        }else{
            System.out.println("Doğrulama Başarısız.");
        }
        driver.quit();
















       /* //WebElement searchBox= driver.findElement(By.id("twotabsearch"));
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys("Dell");
        //driver.findElement(By.id("nav-search-submit-button")).click();
        //WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
        searchBox.sendKeys(Keys.TAB);
        // driver.close();*/

    }
}
