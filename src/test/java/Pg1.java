import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
class PG1 {


    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<2;i++) {
            String exePath = "/Users/ksahil/Downloads/chromedriver";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();
            driver.get("http://49.50.96.235:8088/");
            driver.findElement(By.name("o_fiooolat_login_name")).sendKeys("pkapoor");
            driver.findElement(By.name("o_fiooolat_login_pass")).sendKeys("Dawood@ak47");
            driver.findElement(By.name("o_fiooolat_login_button")).click();
            driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/table/tbody/tr[2]/td[3]/a/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/table/tbody/tr/td[6]/a")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[11]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/form/div/div[1]/a")).click();
            String oldTab = driver.getWindowHandle();
            ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
            newTab.remove(oldTab);
            // change focus to new tab
            driver.switchTo().window(newTab.get(0));
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/span/button[2]")).click();
            driver.quit();
        }

    }

}