package selenium_mor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

		public static void main(String[] args) throws Throwable {

			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");
			WebDriver obj = new ChromeDriver();
			obj.get("https://demo.automationtesting.in/Frames.html");
			
	// imp		
			 
			WebElement outfr = obj.findElement(By.id("singleframe"));
			
			obj.switchTo().frame(outfr); // it goes inside a frame
			
			WebElement insidefr = obj.findElement(By.xpath("/html/body/section/div/div/div/input"));
			insidefr.sendKeys("Gokul");
			
			
	// imp		
			obj.switchTo().defaultContent();   // it comes to total outer default 
			
			Thread.sleep(3000);
			
			
			WebElement nextoptn = obj.findElement(By.xpath("//a[@href='#Multiple']"));
			nextoptn.click();
			
			WebElement nif = obj.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
			obj.switchTo().frame(nif);
			
			WebElement ifd = obj.findElement(By.xpath("/html/body/section/div/div/iframe"));
			obj.switchTo().frame(ifd);
			
			Thread.sleep(3000);
			
			WebElement insidefrm = obj.findElement(By.xpath("/html/body/section/div/div/div/input"));
			insidefrm.sendKeys("Task completed");
			
			
			
			
			
			
			
			
			
			
			
		}

	}

	
	
