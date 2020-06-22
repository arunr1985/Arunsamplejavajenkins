import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class movetomouse2 {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");		
	WebDriver driver =new ChromeDriver();
	driver.get("https://qa1.confirmation.com/");
    
    
	Actions A1 = new Actions(driver);
	WebElement WE1= driver.findElement(By.xpath("//*[@id='menu-item-834']"));
	//Select S1 = new Select(WE1);
	//S1.selectByIndex(0);
    A1.moveToElement(WE1).build().perform();
    WebElement WE2= driver.findElement(By.xpath("//*[@id='menu-item-878']"));
	A1.moveToElement(WE2).click().build().perform();

	
	
	}

}
