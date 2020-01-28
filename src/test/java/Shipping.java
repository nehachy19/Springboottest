import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Shipping
{
    @Test

    public void website() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.officedepot.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement Login= driver.findElement(By.xpath("//div[@class='od-container od-container-lg od-header-account-status-message']"));
        Login.click();
        Thread.sleep(6000);
        WebElement Popup=driver.findElement(By.xpath("//button[@alt='Decline my savings; close the dialog']"));
        Popup.click();
        Thread.sleep(4000);
        WebElement id=driver.findElement(By.xpath("//input[@name='loginName']"));
        id.sendKeys("nehachy19@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Ilovemsd@07");
        WebElement LoginButton=driver.findElement(By.xpath("//button[@class='btn arrow sm_txt js_loginBtn']"));
        LoginButton.click();

        WebElement Search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search.sendKeys("pen");
        WebElement Find=driver.findElement(By.xpath("//button[@data-auid='Header_OdHeaderSearchIcon_SearchIconMagnifyGlass']"));
        Find.click();
        Thread.sleep(4000);
        WebElement Product=driver.findElement(By.xpath("//img[@title='BIC Round Stic Ballpoint Pens Medium']"));
        Product.click();
        WebElement AddToCart=driver.findElement(By.xpath("//span[@id='btgAtcBtnText']"));
        AddToCart.click();
        Thread.sleep(2000);
        WebElement Continue=driver.findElement(By.xpath("//a[@class='btn primary']"));
        Continue.click();
        Thread.sleep(2000);
        WebElement Checkout=driver.findElement(By.xpath("//a[@class='od-button od-button-primary od-button-md od-button-full-width checkout-btn']"));
        Checkout.click();
        Thread.sleep(2000);
        WebElement cvv=driver.findElement(By.xpath("//input[@name='cvvForPreauth']"));
        cvv.sendKeys("446");
        WebElement ContdCheckout=driver.findElement(By.xpath("//button[@data-auid='orderSummary_submit_CheckoutContinue']"));
        ContdCheckout.click();
        WebElement ChangeShipping=driver.findElement(By.xpath("//input[@name='cmd_changeShippingViewAll']"));
        ChangeShipping.isDisplayed();
        ChangeShipping.click();
        Thread.sleep(2000);
        WebElement ShippingAdresses=driver.findElement(By.xpath("//div[@id='shipAddress_dialog']"));
        ShippingAdresses.isDisplayed();
        Thread.sleep(1000);
        WebElement DifferentAddress=driver.findElement(By.xpath("//input[@data-shipment-data='shipToSeq.INDEX[3]']"));
        WebElement DifferentAddress1=driver.findElement(By.xpath("//input[@data-shipment-data='shipToSeq.INDEX[1]']"));
        WebElement DifferentAddress2=driver.findElement(By.xpath("//input[@data-shipment-data='shipToSeq.INDEX[2]']"));

        DifferentAddress.isDisplayed();
        DifferentAddress1.isDisplayed();
        DifferentAddress2.isDisplayed();







    }


}


