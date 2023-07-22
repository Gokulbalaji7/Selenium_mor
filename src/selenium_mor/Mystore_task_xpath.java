package selenium_mor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mystore_task_xpath {

public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		
		WebElement SignI = obj.findElement(By.className("login"));
		SignI.click();
		Thread.sleep(5000);

		
		
		
		
		
// click the element then right click then click inspect then html tab opened 	
// find correct code line then left side of a code . . . three dot click the dot option
// then go to copy -> copy x path.
		
	
// copy xpath
		WebElement create = obj.findElement(By.xpath("//*[@id=\"email_create\"]"));
		create.sendKeys("gokul1@gmail.com");

		WebElement submit = obj.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		submit.click();

		Thread.sleep(10000);

		WebElement mr = obj.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		mr.click();
		Thread.sleep(10000);

		WebElement fn = obj.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		fn.sendKeys("Gokul");
		Thread.sleep(2000);
// copy full xpath
		WebElement ln = obj.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input"));
		ln.sendKeys("R");
		Thread.sleep(2000);
		
		
		
		
		
	
		
	}

}

	
	
