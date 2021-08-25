package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class SetupBrowser {
    public static void main(String[] args) {
        WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();
        //OperaOptions operaOptions = new OperaOptions();
       //operaOptions.addArguments("--disable-notifications")
                //.addArguments("");
    }
}
