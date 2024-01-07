package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		if(driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed()) {
			System.out.println("search page sucsessfully opened");
		}else {
			System.out.println("page is not open");
		}
		driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("java");
		
		driver.close();
		
		
		
		
	/*	List<WebElement> allele = driver.findElements(By.cssSelector("div[jsname='aajZCb']"));


		System.out.println(allele.size());

		for(WebElement i:allele) {
		String txt = i.getText();
		System.out.println(txt);
		}*/












	}
}
