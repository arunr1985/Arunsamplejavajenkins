
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Day2class 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");	
    WebDriver A1 = new ChromeDriver();
    A1.get("https://in.yahoo.com");
    A1.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    A1.findElement(By.xpath("//*[@id='header-search-input']")).sendKeys("India");
    A1.findElement(By.cssSelector("[data-icon='search']")).click();
    A1.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
    //A1.findElement(By.cssSelector("[data-icon='search']")).click();
	A1.close();
	
	}

}
