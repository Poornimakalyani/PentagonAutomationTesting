package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/product.php");
		Actions a=new Actions(driver);
		
		//1st Approch
		WebElement doubleclick = driver.findElement(By.id("add"));
		//a.doubleClick(doubleclick).perform();
		
		//2nd Approch
		//x=216 y =299 we get from mouse extension in top corner 
		a.moveByOffset(216, 299).doubleClick().perform();
		
		//Scroll actions
		a.keyDown(Keys.ARROW_DOWN);
		a.keyDown(Keys.ARROW_DOWN);
		a.keyUp(Keys.ARROW_UP);
		Thread.sleep(2000);
		
		//right click or Context click
		a.contextClick().perform();
		
		
		

	}

}
