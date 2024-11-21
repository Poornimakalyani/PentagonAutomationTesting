package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/register");
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		firstName.sendKeys("Poornima",Keys.CONTROL+"A");
		Thread.sleep(2000);
		firstName.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		lastName.sendKeys(Keys.CONTROL+"V");
		driver.quit();

	}

}
