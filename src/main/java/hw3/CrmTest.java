package hw3;

import com.sun.org.apache.bcel.internal.generic.Visitor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.tapestry5.corelib.components.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.springframework.boot.autoconfigure.AutoConfigurationMetadata;

public class CrmTest {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        LoginToCrm();
        Thread.sleep(8000);
        driver.get("https://crm.geekbrains.space/expense-request/");
        driver.findElement(By.xpath("//a[@title='Создать заявку на расход']")).click();
        driver.findElement(By.name("crm_expense_request[description]")).sendKeys("test");
        Select businessUnitSelect = new Select(driver.findElement(By.name("crm_expense_request[businessUnit]")));

        //name="crm_expense_request[businessUnit]"
    }
    public static void LoginToCrm () throws InterruptedException {
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.xpath("//button")).click();

    //id="prependedInput"
    //id="prependedInput2"
    //button
    }
}