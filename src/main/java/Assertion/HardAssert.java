package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	String ExpectedResult="Kids Clothing - Buy Kids Clothes, Dresses & Bottom wear Online in India";
	driver.findElement(By.partialLinkText("KIDS")).click();
	//String ActualResult=driver.getTitle();
	Assert.assertEquals(ExpectedResult, driver.getTitle());

	
	
}
	


}
