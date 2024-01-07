package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFresherLinkAutomate {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String explink="https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        for(WebElement i:elements) {
        System.out.println(i.getText());
        System.out.println(i.getAttribute("href"));
        try {
        if(i.getAttribute("href").contains(explink))
        {System.out.println("test case pass");
      	    i.click();
            break;
        	}
        	}catch(NullPointerException n) {
        		System.out.println("Atrribute href value is null ");
        	}
        }
        	
		}
	
        }
