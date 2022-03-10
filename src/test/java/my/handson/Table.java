package my.handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
	List<WebElement>	rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	System.out.println("number of rows"+ rows.size());
	
	List<WebElement>	cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
	System.out.println("number of cols"+ cols.size());
	for(int i=1; i< rows.size();i++)
	{
		for(int j=1;j< cols.size();j++)
		{
			
	     System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+"\t");		
		}
		System.out.println();
	}
	}
}
