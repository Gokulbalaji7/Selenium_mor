package selenium_mor;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_task {

	public static void main(String[] args) {


				Scanner gk = new Scanner(System.in);
				System.out.println("search google or facebook");

				// String a = "google";
				// String b = "facebook";

				String g1 = gk.next();

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\gokul\\eclipse-workspace\\selenium_mor\\driver\\chromedriver.exe");


				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-Origins=*");
				
				WebDriver gokul = new ChromeDriver();

				if (g1.equalsIgnoreCase("google")) {
					gokul.get("https://www.google.com/");
				} else if (g1.equalsIgnoreCase("facebook")) {
					gokul.get("https://www.facebook.com/");

				}

			}

		}

		
		
		
		
		