package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_tagName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String exp="https://www.youtube.com/";
	List<WebElement> ele = driver.findElements(By.tagName("a"));
	System.out.println(ele.size());
	for(WebElement e:ele) {
		System.out.println(e.getText());
		System.out.println(e.getAttribute("href"));
		if(e.getAttribute("href").contains(exp))
		{
			System.out.println("Link found.....Test Pass!");
			e.click();
			break;
		}
		}
		
	}
	
/*	List<WebElement> webele = driver.findElements(By.tagName("input"));
	System.out.println(webele.size());
	for(WebElement f:webele) {
		System.out.println(f.getText());
		System.out.println(f.getAttribute("name"));
	}*/
}

