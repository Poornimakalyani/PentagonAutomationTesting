package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="Insta")
	
	public void senddata(String user,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.name("username"));
		WebElement passwrd = driver.findElement(By.name("password"));
		username.sendKeys(user);
		passwrd.sendKeys(password);
		driver.quit();
		
	}
		
		@org.testng.annotations.DataProvider(name="Insta")
		public String[][] credentials(){
			String[][] data= {
					{"Jayalaxmi","jaya@123"},
					{"Rithika","rithi@1234"},
					{"Poornima","poorni@199"},
					{"Lavanya","lavanya@3455"}
					
			};
			return data;
				
	
			
		}
	}

