package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch1 {
	@Test(groups="Smoke")
	public void swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy Web page",true);
		driver.quit();
		
	}
	

}
