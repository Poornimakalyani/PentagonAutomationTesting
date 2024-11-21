package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getReactMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Email= driver.findElement(By.name("email"));
		WebElement Password = driver.findElement(By.name("pass"));
		//Converting for comparision
		Rectangle emailtextfield = Email.getRect();
		Rectangle passwordtextfield = Password.getRect();
		//Printing X-value
		System.out.println(emailtextfield.getX());
		System.out.println(passwordtextfield.getX());
		
		//Comparison
		if(emailtextfield.getX()==passwordtextfield.getX()) {
			System.out.println("X-Co-Ordinates of both textfield are same");
	
		}
		else
			System.out.println("X-Co-Ordinates of both textfield are not same");
		
	

	}

}
