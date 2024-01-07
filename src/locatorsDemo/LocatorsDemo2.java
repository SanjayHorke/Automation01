package locatorsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
}
