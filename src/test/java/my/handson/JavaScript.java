package my.handson;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
	}

}
