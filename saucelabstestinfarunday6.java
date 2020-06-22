import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabstestinfarunday6 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arunr\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\Documents\\chromedriver_win32\\\\chromedriver.exe");	
	    DesiredCapabilities db = new DesiredCapabilities().chrome();
	    db.setCapability("Version", "83");
	    db.setCapability("Platform", "WINDOWS 10");
	    
	    WebDriver driver = new RemoteWebDriver(new URL("https://arunr1985:08cef225-5c9d-470b-91e6-c0ced64552b3@ondemand.us-west-1.saucelabs.com:443/wd/hub"), db);
	    
	    driver.get("https://login.yahoo.com");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());
	    driver.quit();
	    //Thread.sleep(1000L);
	    
	
	}

}
