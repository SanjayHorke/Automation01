package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureMultipleElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String expUrl="https://tutorialsninja.com/demo/index.php?route=account/login";
		String exp="Reward Points";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/success");
		driver.manage().window().maximize();
		List<WebElement> els = driver.findElements(By.xpath("//div[@class='list-group']//a"));

		for(WebElement i:els) {
			if(i.getText().contains(exp)) {
				Thread.sleep(5000);
				String text = i.getText();
				System.out.println(text);

				i.click();
				if(driver.getCurrentUrl().contains(expUrl)) {
					System.out.println("test case is pass");
				}else {
					System.out.println("test case is fail");
				}
			}
		}	
	}
}
