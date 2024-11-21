package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//1st approch with non parametrized method
		Actions a=new Actions(driver);
		//a.click().perform();
		
		//2nd Approch with parameterized method
		WebElement click = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
		a.click(click).perform();
		
	}

}
