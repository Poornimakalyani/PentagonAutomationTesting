package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Disabled_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.linkText("jdk-17.0.13_linux-aarch64_bin.tar.gz")).click();
		//we have to click manualy on checkbox then inspect it
		WebElement disable = driver.findElement(By.linkText("Download jdk-17.0.13_linux-aarch64_bin.tar.gz"));
		js.executeScript("arguments[0].click();", disable);
		driver.quit();
	}

}
