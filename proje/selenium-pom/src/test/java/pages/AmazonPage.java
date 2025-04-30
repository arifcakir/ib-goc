package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage {
    WebDriver driver;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    public void searchProduct(){
        searchBox.click();
        searchBox.sendKeys("Dell");
        searchBox.sendKeys(Keys.ENTER);
    }
}
