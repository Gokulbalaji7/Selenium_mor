package selenium_mor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Project_Adactinhotel {

		public static void main(String[] args) throws Throwable {

			
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
	

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-Origins=*");
			WebDriver driver = new ChromeDriver(option);

			
			driver.get("https://adactinhotelapp.com/");

	// 1 st page
			
			WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("gokulbala");
			
			WebElement pswd = driver.findElement(By.id("password"));
			pswd.sendKeys("gokulbalaji12345");
			
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
			
	// 2 nd page
			WebElement locat = driver.findElement(By.id("location"));
			Select g1 = new Select(locat);
			g1.selectByIndex(1);
			
			WebElement htls = driver.findElement(By.id("hotels"));
			Select g2 = new Select(htls);
			g2.selectByValue("Hotel Sunshine");
			
			WebElement roomty = driver.findElement(By.id("room_type"));
			Select g3 = new Select(roomty);
			g3.selectByVisibleText("Deluxe");
			
			WebElement roomnos = driver.findElement(By.id("room_nos"));
			Select g4 = new Select(roomnos);
			g4.selectByValue("1");
			
			WebElement checkin = driver.findElement(By.id("datepick_in"));
			checkin.clear();
			checkin.sendKeys("11/11/2022");
			
			WebElement checkout = driver.findElement(By.id("datepick_out"));
			checkout.clear();
			checkout.sendKeys("12/11/2022");
			
			WebElement adultnos = driver.findElement(By.id("adult_room"));
			Select g5 = new Select(adultnos);
			g5.selectByValue("2");
			
			WebElement chidnos = driver.findElement(By.id("child_room"));
			Select g6 = new Select(chidnos);
			g6.selectByVisibleText("0 - None");
			
			WebElement search = driver.findElement(By.id("Submit"));
			search.click();
			
			Thread.sleep(2000);
	//3	rd page	
			
			
			WebElement button = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]"));
			button.click();
			Thread.sleep(2000);
			
			WebElement contnue = driver.findElement(By.id("continue"));
			contnue.click();
			
	//4 th page
			WebElement fn = driver.findElement(By.id("first_name"));
			fn.sendKeys("Gokul");
			
			WebElement ln = driver.findElement(By.id("last_name"));
			ln.sendKeys("bala");
			
			WebElement addr = driver.findElement(By.id("address"));
			addr.sendKeys("no:11, sss street, chidambaram ");
			
			WebElement ccnum = driver.findElement(By.id("cc_num"));
			ccnum.sendKeys("6543289760127654");
			
			WebElement cctyp = driver.findElement(By.id("cc_type"));
			Select g7 = new Select(cctyp);
			g7.selectByVisibleText("VISA");
			
			WebElement expmth = driver.findElement(By.id("cc_exp_month"));
			Select g8 = new Select(expmth);
			g8.selectByVisibleText("December");
			
			WebElement expyr = driver.findElement(By.id("cc_exp_year"));
			Select g9 = new Select(expyr);
			g9.selectByValue("2022");
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("786");
			
			WebElement booknow = driver.findElement(By.id("book_now"));
			booknow.click();
			
			Thread.sleep(10000);
	//5 th page
			WebElement clckmyitinerary = driver.findElement(By.id("my_itinerary"));
			clckmyitinerary.click();
			
			Thread.sleep(5000);
			
	//6 th page
			WebElement cncl = driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[7]/td[1]/input"));
			cncl.click();
			
			WebElement cnclall = driver.findElement(By.name("cancelall"));
			cnclall.click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			al.accept();
			
			
			Thread.sleep(10000);
			WebElement lout = driver.findElement(By.xpath("//*[@id=\"logout\"]"));
			lout.click();	
		}}	
/*this user ID is real
gokulbala usern
gokulbalaji12345 psw
gokulbalaji12345@gmail.com mail */

	
	
	
	
