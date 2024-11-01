package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class test1 extends LaunchQuit {
	public void login_to_amazon() {
		WebElement s= driver.findElement(By.id("nav-link-accountList"));
		s.click();
	WebElement un = driver.findElement(By.id("ap_email"));
	un.sendKeys("+918882024981");
	WebElement un_cont= driver.findElement(By.id("continue"));
	un_cont.click();
	WebElement password= driver.findElement(By.id("ap_password"));
	password.sendKeys("tanishka");
	WebElement signin= driver.findElement(By.id("signInSubmit"));
	signin.click();
}
}
