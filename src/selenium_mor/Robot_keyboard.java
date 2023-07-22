package selenium_mor;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_keyboard {

		public static void main(String[] args) throws Throwable {

			
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
	
			WebDriver driver = new ChromeDriver(option);
		
			driver.get("http://www.greenstechnologys.com/index.html");
			
			
			
			Actions ac = new Actions(driver);
			
			WebElement g1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
			ac.contextClick(g1).build().perform();// contextclick means right click it is in mouse action
			
			Thread.sleep(2000);
			
			
			Robot ro = new Robot();
			
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			
			String nexttab = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
			if(!(string.equals(windowHandles))) {
			driver.switchTo().window(string);
			Thread.sleep(2000);
				}
			}
	
			driver.switchTo().window(nexttab);
			
			
			
			

	}}

