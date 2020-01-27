import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Search {
      @Test
    public void website2() throws InterruptedException {

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
          Thread.sleep(2000);
          WebElement pen=driver.findElement(By.xpath("//a[contains(@data-auid, 'Header_OdMenuLink_SearchResult') and (contains(@title,'pen') or contains(@title,'Pen'))]"));
          pen.isDisplayed();


          //get the count
            List<WebElement> pencount= driver.findElements(By.xpath("//ul[@data-auid='Header_OdMenu_SearchResult']//li"));
            int penrecomcount=pencount.size();
            for(int j=0;j<penrecomcount;j++)
            {
                if(pencount.get(j).getText().contains("pens"));
                {
                    System.out.println(pencount.get(j).getText());
                }
               }




            for(int i=0;i<penrecomcount;i++)
            {
                  String text=pencount.get(i).getText().toLowerCase();
                  int k=text.indexOf("pen");
                  if(k!=0 && text.charAt(k-1)!=' ')
                  {
                        System.out.println(text);

                  }

            }


}}
