package datadrivenarunmore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriventolearnarun 
{
public WebDriver driver;


@BeforeTest
void getsystemproperties()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arunr\\Documents\\chromedriver_win32\\chromedriver.exe");	
}

@Test
void getdata() throws IOException
{
	Properties pop = new Properties();
	FileInputStream fs= new FileInputStream("C:\\Users\\arunr\\eclipse-workspace\\ARUN DAY 1\\src\\datadrivenarunmore\\aruns.properties");
	pop.load(fs);
	driver = new ChromeDriver();
	
	if(pop.getProperty("username").equals("arunn"))
	{
		driver.get(pop.getProperty("url"));
	}
	else
	{
		System.out.println("Keyword wrong");
	}
	
	
	
}



}
