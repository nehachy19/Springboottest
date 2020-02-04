import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import static org.junit.Assert.fail;

public class RecentSearchTest
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
        Thread.sleep(2000);
        WebElement Cancel=driver.findElement(By.xpath("//div[@class='od-header-cross od-header-cross-variant-black']"));
        Cancel.click();
        Thread.sleep(2000);
        WebElement Search1=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search1.sendKeys("Table");
        WebElement Find1=driver.findElement(By.xpath("//button[@data-auid='Header_OdHeaderSearchIcon_SearchIconMagnifyGlass']"));
        Find1.click();
        Thread.sleep(2000);
        WebElement Cancel1=driver.findElement(By.xpath("//div[@class='od-header-cross od-header-cross-variant-black']"));
        Cancel1.click();
        Thread.sleep(2000);
        WebElement Search2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search2.sendKeys("Sofa");
        WebElement Find2=driver.findElement(By.xpath("//button[@data-auid='Header_OdHeaderSearchIcon_SearchIconMagnifyGlass']"));
        Find2.click();
        WebElement Search3=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        Search3.click();
        Thread.sleep(2000);

       List<WebElement> RecentItem=driver.findElements(By.xpath("//a[contains(@data-auid,  'Header_OdMenuLink_RecentSearchLink')]"));
       int ItemCount=RecentItem.size();
       for(int j=0;j<ItemCount;j++)

       {

           String[] myStringArray = { "Sofa","Table", "pen"};

           if(RecentItem.get(j).getText().contains(myStringArray[j]))
           {
               System.out.println(myStringArray[j]);
               Thread.sleep(2000);
           }
           else
           {
               fail();
           }

       }

        //li[contains(@class, 'od-menu-item recent-search-item')]
}}
