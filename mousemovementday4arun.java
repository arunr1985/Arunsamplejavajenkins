import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovementday4arun {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");		
        /*WebDriver A1 = new ChromeDriver();
        
        A1.get("https://www.amazon.in");
        Actions Ac1 = new Actions(A1);
        WebElement WE1= A1.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"));
        
        Ac1.moveToElement(WE1).build().perform();
        WebElement WE2= A1.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        Ac1.keyDown(Keys.SHIFT).moveToElement(WE2).sendKeys("mi").build().perform();
        Ac1.contextClick().build().perform();*/ 
		
		
		
		
		
		WebDriver A1 = new ChromeDriver();
		A1.get("https://qa1.confirmation.com");
		
		Actions AC1 = new Actions(A1);
		WebElement WE1 = A1.findElement(By.xpath("//*[@id='menu-item-1080\']/a/span"));
		AC1.moveToElement(WE1).build().perform();
	    WebElement WE2 = A1.findElement(By.xpath("//*[@id='menu-item-829']/a/span[2]"));
	    AC1.click(WE2).build().perform();
	    //WebElement WE3 = A1.findElement(By.cssSelector("[class='button fill_button']"));
	    //AC1.contextClick(WE3);
	   // AC1.click(WE3).build().perform();
	    WebElement WE4= A1.findElement(By.cssSelector("[class='menu-image-title-after menu-image-title']"));
	    try
	    {
	   	    
	    A1.findElement(By.cssSelector("[class='menu-image-title-after menu-image-title']")).sendKeys(Keys.ENTER);
	    }
	catch ( Exception E )
	    {
		AC1.moveToElement(WE4).click().build().perform();
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
        
        
	}

}
