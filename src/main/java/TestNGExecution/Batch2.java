package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch2 {
	@Test(groups="Functional")
	public void Zomato() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Reporter.log("Zomatto Web page",true);
		driver.quit();
		

}
}