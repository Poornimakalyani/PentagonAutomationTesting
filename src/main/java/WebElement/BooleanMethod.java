package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println(loginbutton.isSelected());
	}

}
