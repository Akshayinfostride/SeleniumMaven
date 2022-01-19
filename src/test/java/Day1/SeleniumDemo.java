package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
//        System.out.println(driver.getTitle());
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Ananya Dash");
        driver.findElement(By.id("systemUser_userName")).sendKeys("Dashh#1");
        driver.findElement(By.id("systemUser_status")).click();
        Select choose = new Select(driver.findElement(By.id("systemUser_status")));
        choose.selectByValue("1");
        driver.findElement(By.id("systemUser_password")).sendKeys("Lakhan#1234");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Lakhan#1234");
        Thread.sleep(3000);
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Dashh#1");
//        WebDriverWait w = new WebDriverWait(driver, 10);

        WebElement abc = driver.findElement(By.xpath(""));
        Assert.assertTrue(abc.isDisplayed());

        class user
        {
            void.in()
                {
                     user login=new user();
                 }

        }
    class B extends user
    {
        void.out()
            {
                System.out.println();
                B logout= new B();
            }
    }
class C {

            login.in();
            logout.out();

        }
    }
}

