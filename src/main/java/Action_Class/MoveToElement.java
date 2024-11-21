package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouseovermethod
public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		
		WebElement kids = driver.findElement(By.partialLinkText("KIDS"));
		a.moveToElement(kids).perform();
		driver.findElement(By.linkText("Jeans")).click();
		
		

	}

}
