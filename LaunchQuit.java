package selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class LaunchQuit {
	WebDriver driver;
	
@BeforeMethod
@Parameters("browser")
public void launch(String nameofbrowser) {
	if(nameofbrowser.equals("chrome")) {
		driver= new ChromeDriver();
	}
	
	if(nameofbrowser.equals("edge")) {
		driver= new EdgeDriver();
	}
	driver.get("https://www.amazon.in");
	
}
@AfterMethod
public void quit() {
	
}
}
