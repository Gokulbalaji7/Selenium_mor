package selenium_mor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertcreate_Example {

	public static void main(String[] args) throws Throwable {
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");	
//		WebDriver obj = new ChromeDriver();
	
		
		
		//below is new version
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		
		WebDriver obj = new ChromeDriver(option);
//before is new version
		
		
		
		obj.get("http://testleaf.herokuapp.com/pages/Alert.html");

// 1.inspect aleart created by manually see in note.		
// 2. this below alert is created by java scriptcode  
	
		
		
//we shld type this syntax for alert create
		
		JavascriptExecutor gg = (JavascriptExecutor)obj; 
		Object g1 = gg.executeScript("alert('Welcome to Handle Alerts')");
// below are extra i will merge those.		
		Thread.sleep(3000);
		Alert g2 = obj.switchTo().alert();
		g2.accept();
		
		
		
		
	}

}

		
		
		
		
		
		
		
		
		