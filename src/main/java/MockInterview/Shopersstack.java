package MockInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopersstack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		Actions a=new Actions(driver);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		Thread.sleep(4000);

		
		
		//driver.findElement(By.partialLinkText("Swagger Documentation")).click();
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//
//		for(;;) {
//			try {
//				driver.findElement(By.partialLinkText("Swagger Documentation")).click();
//				break;	
//			
//			}
//			
//			catch(Exception e) {
//				js.executeScript("window.scrollBy(0,500)", true);
//			}
//	
//		}
//		Thread.sleep(5000);
	//	driver.quit();
	}
	
}


