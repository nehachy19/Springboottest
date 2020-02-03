import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterTest
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
        WebElement FIlter1=driver.findElement(By.xpath("//*[@id=\"refinementForm\"]/div[3]/ul/li[5]/a"));
        FIlter1.click();
        Thread.sleep(4000);
        WebElement Brand=driver.findElement(By.xpath("//a[contains(@title, 'Cross®')]"));
        List<WebElement> pencount= driver.findElements(By.xpath("//div[contains(@class, 'gw3 omega ')]"));
        int penrecomcount=pencount.size();
        for(int j=0;j<penrecomcount;j++)
        {
            if(pencount.get(j).getText().contains("Cross"));
            {
                System.out.println("  Filter 1 (Brand)   ");
                System.out.println(j+1 +"  Product Identify");

            }
        }
        System.out.println("All Products are of Cross Brand ");
        WebElement Filter2=driver.findElement(By.xpath("//*[@id=\"refinementForm\"]/div[6]/ul/li[1]/a"));
        Filter2.click();
        Thread.sleep(3000);
        List<WebElement> Rating5=driver.findElements(By.xpath("//div[contains(@class, 50) or contains(@class, 49)]"));
        int star5=Rating5.size();
        if(star5<=7)
        {
            System.out.println("   Filter 2 (Ratings)  ");
            System.out.println("5 Rating Product is Present");
        }
        List<WebElement>Rating4=driver.findElements(By.xpath("//div[contains(@class, 46)]"));
        int star4=Rating4.size();
        if(star4==0)
        {
            System.out.println("Only 5 Star Product is Present");
        }
        else{
            System.out.println(star4 +"  Four Star product is also present");
        }





}}
