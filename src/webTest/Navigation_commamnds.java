package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

public class Navigation_commamnds {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.facebook.com/");
		String title2=driver.getTitle();
		System.out.println(title2);
		if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed()){
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		if(driver.getCurrentUrl().contains("facebook.com/")) {
			System.out.println("test case is pass");

		}else {
			System.out.println("Test case is fail");
		}
		driver.close();

	}
}
