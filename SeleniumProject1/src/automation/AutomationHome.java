package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationHome {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nayee\\IdeaProjects\\SeleniumProject1\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://amazon.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        driver.manage().window().maximize();
        driver.close();
    }

}