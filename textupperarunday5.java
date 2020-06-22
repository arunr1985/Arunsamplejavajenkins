import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textupperarunday5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");		
        WebDriver A1 = new ChromeDriver();
        A1.get("https://login.yahoo.com");
        A1.manage().window().maximize();
        A1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions Ac1 = new Actions(A1);
        WebElement WE1 = A1.findElement(By.xpath("//*[@id='login-username']"));
        Ac1.keyDown(Keys.SHIFT).moveToElement(WE1).sendKeys("arun").build().perform();
        Thread.sleep(5000L);
        A1.close();
	}

}
