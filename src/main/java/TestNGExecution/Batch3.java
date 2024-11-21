package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch3 {
	@Test(groups="Integraion")
	public void Pizzahut() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		Reporter.log("Pizzahut Web page",true);
		driver.quit();

}
}