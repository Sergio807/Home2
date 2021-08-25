package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class StartOfSelDev {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://crm.geekbrains.space");
        Thread.sleep(5000);
        driver.quit();

    }
}
