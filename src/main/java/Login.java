import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


@Test
public class Login {
	
	public WebDriver driver;
	
	public void base() throws MalformedURLException, InterruptedException {		
	//	String host = "3.110.114.49";
//		DesiredCapabilities dc = DesiredCapabilities.chrome();		
		MutableCapabilities dc;
		dc = new ChromeOptions();
		String completeURL = "http://3.110.114.49:4444/wd/hub";		
		this.driver = new RemoteWebDriver(new URL(completeURL), dc);		
		
//		driver.manage().window().maximize();
		driver.get("https://neosuiteuat.neeyamo.works/login"); // URL
		Thread.sleep(6000);
		driver.findElement( By.id("username")).sendKeys("AT0001"); // Username
		Thread.sleep(3000);
		driver.findElement( By.id("password")).sendKeys("Neeyamo@123"); // Password
		Thread.sleep(3000);		
		driver.findElement(By.id("kc-login")).click(); // Sign In
		Thread.sleep(6000);
		
		driver.quit();
		

	}
	

	
	

}
