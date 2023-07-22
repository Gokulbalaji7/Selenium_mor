package selenium_mor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle_Example {

	public static void main(String[] args) throws Throwable {

		
		

// sometime this website or exception will come so do in testleaf - alert 
				
				
				
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");
				WebDriver obj = new ChromeDriver();
				obj.get("https://demoqa.com/alerts");

				
				WebElement abutton = obj.findElement(By.id("alertButton"));
				abutton.click();
				Thread.sleep(3000);
//alert syntax should type manually
				Alert g1 = obj.switchTo().alert();
				g1.accept();
				
				
				WebElement tabutton = obj.findElement(By.id("timerAlertButton"));
				tabutton.click();
				Thread.sleep(7000);// 5 sec apram dham alert ee varum
				Alert g2 = obj.switchTo().alert();
				g2.accept();
				
				
				WebElement cbutton = obj.findElement(By.id("confirmButton"));
				cbutton.click();
				Thread.sleep(3000);
				Alert g3 = obj.switchTo().alert();
				g3.accept();
			// or	
			//	g3.dismiss();
				
				
				WebElement pbutton = obj.findElement(By.xpath("//*[@id=\'promtButton\']"));
				pbutton.click();
				Alert g4 = obj.switchTo().alert();
				g4.sendKeys("Gokul");
				Thread.sleep(3000);
				g4.accept();
				
				
		
		
		
		
		
	}

}
