package webTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands {
	
	private static String appurl = "https://automationplayground.com/crm/";
	private static String appuserName ="sanjayhorke6@gmail.com";
	private static String appPassword ="123456";
	private static WebDriver driver;
	
	public static void waitForTime(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {

		try {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(appurl);
			System.out.println("test case is starting...");
			driver.findElement(By.id("SignIn")).click();
			waitForTime(5000);
			String title=driver.getTitle();
			System.out.println(title);
			waitForTime(5000);
			if(driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).isDisplayed()) {

				System.out.println("test case is pass");
			}else {
				System.out.println("test case is fail");
			}
			
			driver.findElement(By.id("email-id")).sendKeys(appuserName,Keys.ENTER);
			driver.findElement(By.id("password")).sendKeys(appPassword,Keys.ENTER);
			driver.findElement(By.id("submit-id")).click();
			waitForTime(5000);

			if(driver.findElement(By.xpath("//h2[text()='Our Happy Customers']")).isDisplayed()){
				System.out.println("login page sucsessfully opend");
			}	else {
				System.out.println("login page sucsessfully opend");
			}
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("test case is ended...");
			driver.quit();
		}
	}
}
