package my.handson;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*	WebElement e1=driver.findElement(By.id("searchLanguage"));
		Select s=new Select(e1);
		s.selectByValue("sk");
	//	List<WebElement> l=s.getOptions();
		List<WebElement> e=driver.findElements(By.tagName("option"));
		for(WebElement x:e)
		{
			System.out.println(x.getAttribute("lang"));
		}
		*/
	/*	 List<WebElement> l=  driver.findElements(By.tagName("a"));
		 System.out.println("no. of links="+ l.size());
		 for(WebElement w:l)
			    System.out.println(w.getAttribute("lang")+"\t"+ w.getAttribute("href"));
			    */
		
     WebElement  a=	driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
	     List<WebElement> w=a.findElements(By.tagName("a"));
	     System.out.println("no. of links="+ w.size());
	     for(WebElement we:w)
			    System.out.println(we.getAttribute("lang")+"\t"+ we.getAttribute("href"));
	}

}
