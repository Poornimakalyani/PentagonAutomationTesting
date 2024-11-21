package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebpage {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./ErrorShots/image1.png");//file path ./ErrorShots/
		FileHandler.copy(temp, permanent);
	}

}
