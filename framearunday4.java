import java.nio.file.Files;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.lang.*;
//import org.apache.commons.io.FileUtils;
//import com.sun.java.util.jar.pack.Package.File;

public class framearunday4 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");		
        ChromeOptions CO = new ChromeOptions();
        CO.setAcceptInsecureCerts(false);
		WebDriver driver = new ChromeDriver(CO);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Set<Cookie> Sa= driver.manage().getCookies();
        System.out.println(Sa.size());
        driver.get("https://netbanking.hdfcbank.com/netbanking");
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("1000");
        //File FS = ((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(FS, new File("c:\\tmp\\screenshot.png"));
      //FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);  
        FileHandler.copy(source, new File("C:\\Users\\arunr\\screenshot.png"));
        System.out.println("the Screenshot is taken");
        TakesScreenshot tr = (TakesScreenshot)driver;
        File Fnew = tr.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(Fnew, new File("C:\\Users\\screenshot.png"));
        Thread.sleep(5000L);
        driver.close();
        
	}

}
