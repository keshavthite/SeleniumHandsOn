package my.handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/submit_button_clicked.php#load_box");
		
	WebElement menu=	driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[5]/a"));
	  Actions action=new Actions(driver);
	  action.moveToElement(menu).perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[5]/ul/li[1]/a")).click();
	 
	}

}
