package selenium_mor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse_scroll_up_and_down {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		
		
//Page Down
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
     
//Page Up
        Actions actt = new Actions(driver);
        actt.sendKeys(Keys.PAGE_UP).build().perform();      
        System.out.println("Scroll up perfomed");
        Thread.sleep(3000);
	}

}
