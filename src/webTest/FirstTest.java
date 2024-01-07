package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	//System.out.println(title);
	if(title.equals("Google")) {
		System.out.println("Test case is pass");
	}else {
		System.out.println("Test case is fail");
	}
	driver.close();
}
}
