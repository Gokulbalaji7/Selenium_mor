package selenium_mor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_online {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("https://www.facebook.com/");

		WebElement g1 = obj.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		g1.click();

		WebElement g2 = obj.findElement(By.xpath("//input[text()='firstname']"));
		g2.sendKeys("ddddddddd");

		// WebElement address =
		// obj.findElement(By.xpath("//input[contains(text(),'Mobile number or']"));
		// address.sendKeys("9876543210");

	}

}
