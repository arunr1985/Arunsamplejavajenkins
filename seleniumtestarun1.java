
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumtestarun1 

{
	WebDriver driver;
@Test(groups= {"Priority1"})
void getprint()
{
System.out.println("Yahoo is rani");	
}
	
@BeforeTest
void getsystemproperties()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arunr\\Documents\\chromedriver_win32\\chromedriver.exe");
	
}

@Test
void getdeta()
{
driver = new ChromeDriver();

}
	@Test
	void openbrowser()
	{
		driver.get("https://www.google.com");
	}
	@AfterTest
	void closebrowser()
	{
		driver.close();
	}
	
	
	

}
