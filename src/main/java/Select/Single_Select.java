package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		WebElement Date = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		Select s1=new Select(Date);
		s1.selectByIndex(27);
		Select s2=new Select(Month);
		s1.selectByValue("8");
		Select s3=new Select(Year);
		s3.selectByVisibleText("1997");
		

	}

}
