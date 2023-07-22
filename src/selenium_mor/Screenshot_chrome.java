package selenium_mor;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
  

public class Screenshot_chrome {

	
		public static void main(String[] args) throws Throwable {

	
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\chromedriver\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-Origins=*");
			
			WebDriver driver = new ChromeDriver(option);

			driver.get("https://www.facebook.com/");

			driver.manage().window().maximize();
			

			//facebook aa screenshot eduthu ts la save pani vachuko nu soldrom
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			// save pannadha ts ta irundhu get panni then out panu nu sourcefilee ta soldrom so type ts.getScr and take returntype
			// take return type then (OutputType.FILE) idha nama dhan type pananum
			File sourcefilee = ts.getScreenshotAs(OutputType.FILE);
			
			
// we only write this    File desi = new File(location);
			//endha location folder la save pananum nu designation ta soldrom
			// location path la screenshot folder oda location aa copy paste pananum

//******* important -> location aa sonnadhum last la doubleslash potu enna name la save pana porom nu sollanum.
			// then last la name ku apram .png format nu add pananum EXAMPLE -->  \\facebook.png

			
			File designationn = new File("C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\screenshot_chrome\\facebook.png");

			
			Thread.sleep(2000);
			
	 		
// main syntax for take screenshot is below

			
	        //indha syntax type panadhum io exception varum change to throwable excptn
			
			//ipo join pandrom (out pannadha , indha location la save panu)
			
			FileUtils.copyFile(sourcefilee, designationn);
			
			
	// ippo program run agudhu then running complete agidchu ipo check the folder screenshot_chrome		
	// folder ulla screenshot pic varalana go to file -> refresh or give f5	
			
			
			
		
			
			
		}

	}

	