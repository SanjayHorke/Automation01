package webTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDemo1 {

	public static WebDriver driver;
	public static String url="https://automationplayground.com/crm/";
	public static String acttext="//a[text()='Customer Service']";
	public static String sigin="//a[text()='Sign In']";
	public static String username="horkesanjay6@gmail.com";
	public static String pws="123456";
	public static String acttext1="//h2[text()='Our Happy Customers']";

	public static void waitForTime(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		try {
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(5000);
			if(driver.findElement(By.xpath(acttext)).isDisplayed()){
				System.out.println("sucsessfully navigated on second page");
			}else {
				System.out.println("browser is not opend");
			}
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();

			if(driver.findElement(By.xpath("//a[text()='Customer Service']")).isDisplayed()){
				System.out.println("login page sucsses fully open");
			}else {
				System.out.println("not opend");
			}
			driver.findElement(By.id("email-id")).sendKeys(username,Keys.ENTER);
			driver.findElement(By.id("password")).sendKeys(pws,Keys.ENTER);
			driver.findElement(By.id("submit-id")).click();
			waitForTime(5000);
			
			driver.findElement(By.xpath("/html/body/div/a")).click();
			
			
			WebElement l = driver.findElement(By.linkText("New Customer"));
			JavascriptExecutor j = (JavascriptExecutor) driver;
			waitForTime(5000);
			j.executeScript("arguments[0].click();", l);


//			if (driver.findElement(By.xpath("//h2[text()='Add Customer']")).isDisplayed()) {
//				System.out.println("We are om the add customr page");
//			}else {
//				System.out.println("We are not on the add customr page");
//			}

			//		Thread.sleep(5000);
			//		if(driver.findElement(By.xpath(acttext1)).isDisplayed()){
			//			System.out.println("our happy customet title page should display");
			//		}else {
			//			System.out.println("login is not complte sucssessfully");
			//		} 
			//		Thread.sleep(5000);
			//		driver.findElement(By.id("new-customer")).click();

		} catch (Exception e) {
		}finally {
			driver.quit();
		}
	}
}
