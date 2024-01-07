package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchObjectidentification {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed()) {
		System.out.println("search page sucsessfully opend");
	}else {
		System.out.println("not opend");
	}
	boolean element = driver.findElement(By.xpath("//textarea[@type='search']")).isEnabled();
	System.out.println(element);
	driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("java",Keys.ENTER);
}
}
