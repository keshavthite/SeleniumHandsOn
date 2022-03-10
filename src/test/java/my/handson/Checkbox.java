package my.handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
	/*
	  int i=1;
	  while(isElementPresent(By.xpath("//div[4]/input["+i+"]")))
	  {
		  driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		  i++;
	  }  */
		
		WebElement  l=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> list=l.findElements(By.name("sports"));
		System.out.println("checkboxex count"+ list.size());
		for(WebElement we:list)
		{
			
			we.click();
		}
	}
  public static boolean isElementPresent(By by)
  {
	  int size= driver.findElements(by).size();
	  if(size==0) return false; else return true;
  }
}
