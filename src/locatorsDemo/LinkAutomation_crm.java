package locatorsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAutomation_crm {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://automationplayground.com/crm/");
		String curl = driver.getCurrentUrl();
		if(curl.equalsIgnoreCase("https://automationplayground.com/crm/")) {
			System.out.println("crm app home page opend sucsessfully");
		}else {
			System.out.println("not opened");
		}
		driver.findElement(By.linkText("Sign In")).click();
		if(driver.findElement(By.xpath("//h2[text()='Login']")).isDisplayed()) {
			System.out.println("login page open sucsessfully");
		}else {
			System.out.println("login page  not open sucsessfully");

		}
		driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='password-name']")).sendKeys("12345");

		driver.findElement(By.xpath("//input[@id='remember']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String text=  driver.getCurrentUrl();
		if(text.contains(".com&password-name=12345&submit-name=")) {
			System.out.println("user sucsessfully loged in");
		}else {
			System.out.println("user not logged in yet");
		}
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		if(driver.findElement(By.xpath("//p[text()='Thank you for using the CRM. See you next time!']")).isDisplayed()) {
			System.out.println("user is logged out sucsessfully");
		}else {
			System.out.println("user is not loged out sucsessfully");

	   driver.close();




		}
	}
}
