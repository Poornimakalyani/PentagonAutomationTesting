package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_pop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// alert Popup
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().alert().dismiss();

		// confirmation Popup
//		driver.get("https://licindia.in/en/web/guest/home");
//		driver.findElement(By.partialLinkText("Login")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		// prompt popup
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Poornima");
//		alert.accept();
//		Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();
//		

	}

}
