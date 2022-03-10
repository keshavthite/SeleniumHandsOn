package my.handson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementPresent {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
		System.out.println(isElementPresent("//*[@id='searchLanguage89']"));	
	}
	public static boolean isElementPresent(String locator) {
		
		try {
			
			driver.findElement(By.xpath(locator));
			return true;
		}catch(Throwable t) { 
			return false ;
					}
	}

}
