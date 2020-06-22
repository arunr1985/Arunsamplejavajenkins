
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.*;

public class ARUNDAY1CLASS 

{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//System.setProperty(Webdriver.gecko.driver,"C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64");
      //WebDriver  A1 = new FirefoxDriver();//Runtime polymorphism
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");
	  //System.setProperty("webdriver.ie.driver","C:\\Users\\arunr\\Documents\\IEDriverServer_x64_3.150.1\\\\IEDriverServer.exe");
	  WebDriver A1 = new ChromeDriver();
	  //WebDriver A1 = new InternetExplorerDriver();
      A1.get("https://www.google.com");
      A1.findElement(By.xpath(".//*[@class='gLFyf gsfi']")).sendKeys("yahoo");
      //A1.findElement(By.xpath(".//*[@name='btnK']")).click();
      A1.findElement(By.cssSelector("[class='gNO89b']")).click();
      /*System.out.println(A1.getCurrentUrl());
      System.out.println(A1.getPageSource());
      System.out.println(A1.getTitle());*/
      A1.close();
	}

}
