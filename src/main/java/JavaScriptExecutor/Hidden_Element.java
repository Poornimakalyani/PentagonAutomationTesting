package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Hidden_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement hidden = driver.findElement(By.id("custom_gender"));
		//only one hidden element so index value=0 and use for hidden element to pass value use value keyword
		js.executeScript("arguments[0].value='Anything';",hidden);
		driver.quit();
		
	}

}