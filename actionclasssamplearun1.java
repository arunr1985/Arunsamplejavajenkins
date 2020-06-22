import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclasssamplearun1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
	    
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		Actions A1= new Actions(driver);
		driver.get("https://in.yahoo.com");
		String s1= driver.getTitle();
		
		System.out.println("THe title of the page is "+s1);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement we1= driver.findElement(By.cssSelector("[class='Whs(nw) Ov(h) Tov(e) Fz(19px) tdv2-applet-featurebar:h_Td(u)']"));
		A1.click(we1).build().perform();
		Thread.sleep(1000);
		WebElement we2= driver.findElement(By.cssSelector("[class='StretchedBox Z(1)']"));
		A1.click(we2).build().perform();
		/*String s1= driver.getTitle();
		System.out.println("THe title of the page is "+s1);
		String s2="Dexamethasone: What is it and How Has it Improved Survival Chances of Covid-19 Patients";
		if(s1==s2)
		{
			System.out.println("Welcome home");
		}
		else {
			System.out.println("Different page");
		}
       //System.out.println(s1);*/
		
		Properties pop= new Properties();
		FileInputStream fs= new FileInputStream("C:\\Users\\arunr\\eclipse-workspace\\ARUN DAY 1\\June.properties");
		pop.load(fs);
		driver.get(pop.getProperty("url"));
		
		
	}

}
