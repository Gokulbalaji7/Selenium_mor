package selenium_mor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_element {

	public static void main(String[] args) throws Throwable {

// System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");
		
//		WebDriver obj = new ChromeDriver();

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.google.com/");
		
		WebElement g1 = driver.findElement(By.name("q"));
		g1.sendKeys("NASA" + Keys.ENTER);
		
		
		
		Thread.sleep(2000);
				
		WebElement g2 = driver.findElement(By.xpath("//b[text()='full form headquarters']"));
		g2.click();
		
// any one element mthd is join next to find element and locators 
//click or get text or sendkey or any.
		
	 // String text = g1.getText();
	 // System.out.println(text);
		
	 // WebElement g3 = driver.findElement(By.partialLinkText("nasa full"));
	 //	g3.click();
		
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
// doubt		
	   // String value =	driver.findElement(By.name("btnK")).getAttribute("value");
		//System.out.println(value);
		
		//String attribute = g1.getAttribute("name");
		//System.out.println(attribute);
		
		//WebElement gg = obj.findElement(By.name("btnK"));
		//String value = gg.getAttribute("value");
		
		//System.out.println(value);
		
		
		
	//	WebElement rr = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]"));
	//	boolean enabled = rr.isEnabled();
	//	System.out.println(enabled);
		
		
		
		
		
		
		
		
		
	}

}

		
		
		
		
		
		
		
		
		
		