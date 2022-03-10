package my.handson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
	WebElement slider=	driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	  Actions action=new Actions(driver);
	  action.dragAndDropBy(slider, 2000, 0).perform();
	}

}
