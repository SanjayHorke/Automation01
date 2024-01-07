package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nalin");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("talk2nalin@gmail.com");


		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[position()=5]")).sendKeys("nalin@123");
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));

		Select s1=new Select(ele);
		s1.selectByIndex(3);
		Thread.sleep(3);
		s1.selectByValue("8");

		s1.selectByVisibleText("8");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(ele2);
		s2.selectByIndex(0);
		s2.selectByValue("1");
		s2.selectByVisibleText("Jan");

		WebElement ele3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3=new Select(ele3);
		s3.selectByIndex(26);
		s3.selectByValue("1997");
		s3.selectByVisibleText("1997");


		WebElement ele4 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println(ele4.isSelected());
		if(!ele4.isSelected()) {
			ele4.click();
		}
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5);
		if(driver.findElement(By.xpath("(//h2[text()='Enter the code from your email'])[2]")).isDisplayed()) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");
		}

	}
}
