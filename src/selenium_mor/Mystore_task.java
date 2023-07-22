package selenium_mor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mystore_task {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		
		WebElement SignI = obj.findElement(By.className("login"));
		SignI.click();
		Thread.sleep(5000);
		
		WebElement create = obj.findElement(By.id("email_create"));
		create.sendKeys("gokul1@gmail.com");

		WebElement submit = obj.findElement(By.id("SubmitCreate"));
		submit.click();

		Thread.sleep(10000);

		WebElement mr = obj.findElement(By.id("uniform-id_gender1"));
		mr.click();
		Thread.sleep(5000);

		WebElement fn = obj.findElement(By.id("customer_firstname"));
		fn.sendKeys("Gokul");
		Thread.sleep(5000);

		WebElement ln = obj.findElement(By.name("customer_lastname"));
		ln.sendKeys("R");
		Thread.sleep(5000);

		WebElement password = obj.findElement(By.id("passwd"));
		password.sendKeys("1234567890");
		Thread.sleep(5000);

		WebElement day = obj.findElement(By.id("days"));
		day.sendKeys("2");

		WebElement mnth = obj.findElement(By.id("months"));
		mnth.sendKeys("October");

		WebElement yrs = obj.findElement(By.name("years"));
		yrs.sendKeys("1991");

		WebElement cmpny = obj.findElement(By.id("company"));
		cmpny.sendKeys("IT");

		WebElement addrs1 = obj.findElement(By.name("address1"));
		addrs1.sendKeys("No : 20 Metro street");

		WebElement addrs2 = obj.findElement(By.name("address2"));
		addrs2.sendKeys("No : 21 Metro street");

		WebElement city = obj.findElement(By.id("city"));
		city.sendKeys("CDM");

		WebElement state = obj.findElement(By.name("id_state"));
		state.sendKeys("California");

		WebElement code = obj.findElement(By.id("postcode"));
		code.sendKeys("00000");

		WebElement addinfo = obj.findElement(By.id("other"));
		addinfo.sendKeys("NIL");

		WebElement homeph = obj.findElement(By.name("phone"));
		homeph.sendKeys("04144");

		WebElement phnum = obj.findElement(By.id("phone_mobile"));
		phnum.sendKeys("9786597025");

// dont give register submit account		
		

	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		