import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class formtest {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Mayda");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Aly");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("computer engineer");
        driver.findElement(By.cssSelector("#radio-button-2")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(29) > a")).click();
        driver.quit();
    }
    }

