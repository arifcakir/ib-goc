package tests;

import base.BaseTest;
import pages.AmazonPage;
import org.testng.annotations.*;

public class AmazonPageTest extends BaseTest {
    @Test
    public void amazonSearchProducs(){
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchProduct();
    }
}
