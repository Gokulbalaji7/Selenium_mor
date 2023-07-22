package selenium_mor;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver_Methods {

	public static void main(String[] args) throws Throwable {

		

 		
// check the rough program also
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver/chromedriver.exe");

		
/*		
// for incognito window shoudbe opened in chrome follow below
	 	
			 // give syntax		
			 ChromeOptions obj = new ChromeOptions();
			 
			 // add Incognito in arguments
			 obj.addArguments("incognito");
			 
			// for new tab in window
			 obj.addArguments("new window");
			 
			// syntax should be little change 
			 WebDriver object = new ChromeDriver(obj);

*/				
				
				
// for normal open use below syntax
				
//		 WebDriver object = new ChromeDriver();

		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		
		WebDriver driver = new ChromeDriver(option);				 
				 
		driver.get("https://www.google.com/");

		// object.manage().window().minimize();
		// object.manage().window().fullscreen();
		// object.manage().window().maximize();
	
		Thread.sleep(2000);

//setsize is important
		Dimension g2 = new Dimension(1000, 500);
		driver.manage().window().setSize(g2);
	    
	    Dimension g1 = driver.manage().window().getSize();
		System.out.println(g1);

		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		String g3 = driver.getTitle();
		System.out.println(g3);
		String g4 = driver.getCurrentUrl();
		System.out.println(g4);
		
// doubt 
		//String g5 = object.getPageSource();
		//System.out.println(g5);
	
		
		driver.close();
		//object.quit();
		
// doubt 
        //gokul.manage().deleteAllCookies();
		
		
	}

}
