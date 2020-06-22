import java.awt.Point;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Seleniuminterviewquestions 


{
	WebDriver driver;
	//how to check if alert is present
	public boolean isalertpresent()
	{
		try 
		{
			driver.switchTo().alert();
			return true;
		
		}catch(Exception e) {return false;}
	}
	
	
	
}
//How to accept the Alert
@Test
public void alertswitching()
{
	driver=new ChromeDriver();
	driver.switchTo().alert().accept();//accepts the pop up
	driver.switchTo().alert().dismiss();//dismisses
	Alert alerttext=driver.switchTo().alert();
	System.out.println(alerttext);
	//How to select the frame
	driver.switchTo().frame(1);
	driver.switchTo().frame("name");
	driver.switchTo().frame(driver.findElement(By.xpath("asd")));
	// Window Handling methods
	String abc=driver.getWindowHandle();// gives the unique, parent window id, the window on which we perform actions
	driver.getWindowHandles();// gives all the windows open on the UI and gives as list
	Set<String> allwindows= driver.getWindowHandles();
	Iterator<String> allwin=allwindows.iterator();
	String Parentwindow= allwin.next();
	driver.switchTo().window(Parentwindow);
	String Childwindow= allwin.next();
	driver.switchTo().window(Childwindow);// for getwindowhandles
	
	// for coming back to parent window from child window
	driver.switchTo().defaultContent();
	
	//what are the wait conditions available in selenium
	there are two waits implicit wait and explicit waits
	
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS); //Implicit waits
	WebDriverWait wait= new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));// Explicit waits
	
	// How to use mouse over
	
	Actions act= new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath(""))).build().perform();;
	// How to select dropdown 
	Select sec= new Select(Webelement);
	or
	Select sec= new Select(driver.findElement(By.xpath("")));
	sec.selectByIndex(0);
	sec.selectByValue(abc);
	sec.selectByVisibleText(abc);
	List<WebElements> pp=sec.getOptions();// get all data of the dropdowns
	
	
	//How to drag drop in selenium
	Actions act1= new Actions(driver);
	act1.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
	//How to get a screenshot in the selenium as directlty we cannot 
	get the scrrnshot, so we need to cast the driver
	
	Type cast:
		
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(srcfile, new File("C:\\test\\Screenshot\\login"+".png"));
		
		
		//How to get coordinate of the window
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		//or
		Point position = driver.manage().window().getPosition(); // point is a interface in java
		
		position.getX();
		position.getY();
		
		// How to navigate forward,backward in selenium
		
		driver.navigate().forward();
		driver.navigate().back();
		
		// How to get URL of that page
		driver.getCurrentUrl();// gived URL of the page
		
		String url= driver.getCurrentUrl();
		driver.getTitle();
		
		//How you can count similar object present in the UI
		int size= driver.findElements(By.xpath("")).size(); //will give all the total number of same element present in the UI
		
		// How to 
		driver.findElement(By.xpath("@id[@name='Test']/following-sibling::td[2]"));
		driver.findElement(By.xpath("@id[@name='Test']/preceding-sibling::td[2]"")); // preceding siblings"));
	    driver.findElement(By.xpath("@id[@name='Test')/child::td[2]"));
		
	    
	    // How to get all the similar kind of elements and get the element number 5
	    driver.findElements(By.xpath("")).get(5);//This will give the 5th element present on the UI
	    
	    //Few methods are available
	    //Checkbox is selected or not
	    driver.findElement(By.xpath("")).isSelected();
	    driver.findElement(By.xpath("")).isEnabled();
	    driver.findElement(By.xpath("")).isDisplayed();
	    
	    // How to execute javascript in selenium
	    JavascriptExecutor JavascriptExecutor= ((JavascriptExecutor)driver);
	    JavascriptExecutor.executeScript("return window.length");// gets the number of frames availbale in the UI
	    
	//How to maximize the window
	    driver.manage().window().maximize();
	    driver.get("");
	    
	    // what is the difference between single and double slash
	    // is relative path
	    / absolute path
	    
	    //How to get the attribute value from the Webelement
	    driver.findElement(By.xpath("")).getAttribute("name");//
	    //How to perform enter without clicking
	    driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("")).sendKeys(Keys.// supply all that 
	    // why explicit wait
	    		if i want to wait perticular presence of any element
	    
	    
	    
	    
	    
		
				
				
		
				
	
	
	
	
	
	
}

