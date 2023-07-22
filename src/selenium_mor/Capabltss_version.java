package selenium_mor;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capabltss_version {

		public static void main(String[] args) {

			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");
			WebDriver obj = new ChromeDriver();
			obj.get("http://testleaf.herokuapp.com/pages/Alert.html");

	// important this syntax is downcasting we must type only
			
			Capabilities cap = ((RemoteWebDriver)obj).getCapabilities();
			
			
			String g1 = cap.getBrowserName().toString();
			System.out.println(g1);
			
			String g2 = cap.getBrowserVersion().toString();
			System.out.println(g2);
			
				
			
		}

	}

