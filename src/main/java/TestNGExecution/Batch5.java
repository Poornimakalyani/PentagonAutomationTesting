package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch5 {
	@Test(groups="Smoke")
	public void Dominos() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("Dominos Web page",true);
		driver.quit();


}
}