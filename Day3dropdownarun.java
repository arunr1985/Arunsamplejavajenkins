import java.awt.List;

import org.openqa.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

//import com.sun.tools.javac.util.List;

public class Day3dropdownarun {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");		
        WebDriver A1 = new ChromeDriver();
        //A1.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        //WebElement WE1 = A1.findElement(By.xpath("//*[@id='post-2646']"));
        //WebElement WE1 = A1.findElement(By.xpath(".//*[@id='post-2646']/div[2]/div/div/div/p/select"));
        //Select SA = new Select(WE1);
        //SA.selectByVisibleText("India");
       // SA.selectByIndex(7);
       // System.out.println(SA.isMultiple());
        A1.get("https://www.goindigo.in/");
        //A1.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[2]/div[3]/label/label")).click();
        //A1.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[2]/div[2]/label/label")).click();
      //java.util.List<WebElement>  LA = A1.findElements(By.xpath("//*[@id='bookFlightTab']/form/div[2]/div[2]/label/label"));
      //System.out.println(LA.size());
     // LA.get(0);
      A1.findElement(By.xpath("\r\n" +"//*[@id='bookFlightTab']/form/div[7]/div[2]/label/label")).click();
      System.out.println(A1.findElement(By.xpath("\r\n" +"//*[@id='bookFlightTab']/form/div[7]/div[2]/label/label")).isSelected());
        Alert Al= A1.switchTo().alert();
        Al.accept();
        Al.dismiss();
        
	}

}
