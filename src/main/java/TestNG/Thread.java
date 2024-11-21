package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thread {
	@Test (threadPoolSize=3)
	public void Olafoods() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blog.olacabs.com/");
		Reporter.log("olafood is Launched",true);
		driver.quit();

}

	@Test (invocationCount = 3)
	public void Swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy is Launched",true);
		driver.quit();
	}
}