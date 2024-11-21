package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch4 {
	@Test(groups="System")
	public void KFC() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.kfc.co.in/");
		Reporter.log("KFC Web page",true);
		driver.quit();

}
}
