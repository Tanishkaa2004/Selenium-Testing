package selenium_testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class test2 extends LaunchQuit {
	@Test
  public void searching_on_amazon() {
	
	WebElement search =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("bags");
	search.sendKeys(Keys.ENTER);
	}
}
