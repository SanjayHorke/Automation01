package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_css {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		if(driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed()) {
			System.out.println("login page is open sucsessfully");
		}else {
			System.out.println("login page is not open ");

		}
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		if(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
			System.out.println("user is logged in sucsessfully");
		}else {
			System.out.println("user is anable to logged in");
		}
		driver.close();
	}
}
