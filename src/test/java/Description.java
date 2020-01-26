import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Description {
    @Test

    public void website1() throws InterruptedException {
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

        WebElement ProductDescription=driver.findElement(By.xpath("//h2[@data-auid='productDetails_title_description']"));

        Dimension weD = ProductDescription.getSize();
        Point weP = ProductDescription.getLocation();

        Dimension d= driver.manage().window().getSize();


        int x=d.getWidth();
        int y= d.getHeight();
        int x2=weD.getWidth();
        int y2=weD.getHeight();

        System.out.println(x+"---"+y+"---"+x2+"--"+y2);

        WebElement DescriptionLink=driver.findElement(By.xpath("//a[@id='descriptionLink']"));
        DescriptionLink.click();


        Thread.sleep(3000);

        x=d.getWidth();
         y= d.getHeight();
         x2=weD.getWidth();
        y2=weD.getHeight();
        System.out.println(x+"---"+y+"---"+x2+"--"+y2);
    }



}
