package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagOElAjXkiWi3iWFWTsYMqrsi0vBX6MofC6CV3cr4G3wCsf-HCld5DRoCaKwQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		//take file path from properties and locatation and name
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\Poorni\\Document\\1_Poornima Kalyani CV (1).pdf");
		//or go to security and copy file path
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\Poorni\\Document\\1_Poornima Kalyani CV (1).pdf");
		
	}

	}


