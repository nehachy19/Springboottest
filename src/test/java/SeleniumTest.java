

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class SeleniumTest {

    @Test

    public void website() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
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
        WebElement CartFresh=driver.findElement(By.xpath("//span[@class='od-header-badge od-header-cart-icon-badge']"));
        CartFresh.click();

        List<WebElement> myDynamicList =  driver.findElements(By.xpath("//div[contains(@data-auid, 'CartRemove')]"));

        Thread.sleep(2000);
        int a=myDynamicList.size();
        System.out.println(""+a);
        for (int i=0; i<a;i++)
        {
            try {
                WebElement ProductCancel=driver.findElement(By.xpath("//div[contains(@data-auid, 'CartRemove')]"));
                ProductCancel.click();

            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                WebElement ProductCancel=driver.findElement(By.xpath("//div[contains(@data-auid, 'CartRemove')]"));
                ProductCancel.click();
            }




        }
        Thread.sleep(2000);

        WebElement Contshopping=driver.findElement(By.xpath("//a[@data-auid='OdCart_OdButton_EmptyCartContinueShopping']"));
        Contshopping.click();
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
        WebElement Status=driver.findElement(By.xpath("//div[@class='od-container od-container-lg od-header-account-status-message']"));
        actions.moveToElement(Status).perform();
        Thread.sleep(2000);
        WebElement Signout=driver.findElement(By.xpath("//a[@data-auid='Header_OdMenuLink_Signout']"));
        Signout.click();
        WebElement LogIn= driver.findElement(By.xpath("//div[@class='od-container od-container-lg od-header-account-status-message']"));
        LogIn.click();

        Thread.sleep(1000);
        WebElement id1=driver.findElement(By.xpath("//input[@name='loginName']"));
        id1.sendKeys("nehachy19@gmail.com");
        WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
        password1.sendKeys("Ilovemsd@07");
        WebElement LoginButton1=driver.findElement(By.xpath("//button[@class='btn arrow sm_txt js_loginBtn']"));
        LoginButton1.click();
        Thread.sleep(2000);

        WebElement CartInfo=driver.findElement(By.xpath("//span[@class='od-header-cart-icon-badge-container']"));
        CartInfo.click();
        Thread.sleep(2000);
        WebElement CartItems=driver.findElement(By.xpath("//img[@src='https://officedepot.scene7.com/is/image/officedepot/664011_o01_bic_round_stic_ballpoint_pens?$OD%2DMed$']"));
        CartItems.equals(Product);




    }


}
