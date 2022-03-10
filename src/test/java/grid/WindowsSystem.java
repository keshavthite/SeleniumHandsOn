package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsSystem {
  WebDriver driver;
	@Test(priority=1)
	public void setup() throws MalformedURLException
	{
	     String nodeURL="http://192.168.212.196:8868/wd/hub";	
	     DesiredCapabilities cap=new DesiredCapabilities();
	     
	     cap.setBrowserName("chrome");
	     cap.setPlatform(Platform.WIN10);
	     
		WebDriverManager.chromedriver().setup();
		  driver=new RemoteWebDriver(new URL(nodeURL),cap);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test(priority=2)
	public void login()
	{
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("keshavthite9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("keshavthite@0105");
		driver.findElement(By.name("login")).click();
		
		String text=driver.findElement(By.xpath("//*[@id=\'page-36\']/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertTrue(text.contains("keshavthite9"));
		driver.close();
	}

}
