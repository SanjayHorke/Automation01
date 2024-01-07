package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AxiesDemo8 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationplayground.com/crm/customers."
    + "html?email-name=nallagonga%4012gmail.com&password-name=1325553&submit-name=");
	driver.manage().window().maximize();
	WebElement eles = driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody"));
	System.out.println(eles.getText()); 
	
	//to get parent of john
	
	WebElement ele2 = driver.findElement(By.xpath("//td[text()='John']//parent::tr"));
	System.out.println(ele2.getText()); 
	System.out.println("******************");
	// to get child of tr
	List<WebElement> ele3 = driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
	System.out.println(ele3.size());
	for(WebElement i:ele3) {
		System.out.println(i.getText());
	}
	System.out.println("****************");
	//to get preceding ele from john
	List<WebElement> ele4 = driver.findElements(By.xpath("//td[text()='John']//preceding::tr"));
	System.out.println(ele4.size());
	
	
	for(WebElement i:ele4) {
		System.out.println(i.getText());
	}
	System.out.println("***************");
	List<WebElement> ele5 = driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td"));
	System.out.println(ele5.size());
	for(WebElement i:ele5) {
		System.out.println(i.getText());
	}
	System.out.println("********************");
	List<WebElement> ele6 = driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
	for(WebElement i:ele6) {
		System.out.println(i.getText());
	}
}
}
