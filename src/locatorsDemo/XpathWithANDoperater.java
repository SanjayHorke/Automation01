package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithANDoperater {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='form-control' and @name='firstname']")).sendKeys("sanjay ");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("horke");
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=3]")).sendKeys("sanjayhorke8@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("9512891745");
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("12345");
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("12345");
		List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input"));

		for(WebElement i:ele) {
			if(!i.isSelected()) {
				i.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[name='agree']")).click();
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[position()=1]")).click();
		
		if(driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).isDisplayed()) {
			System.out.println("Test case is sucsessfully pass user has been loged in sucsessfully");
		}

	}

}
