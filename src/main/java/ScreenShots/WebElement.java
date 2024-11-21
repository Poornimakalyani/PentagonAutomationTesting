package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		// No need to upcast for single element
		File temp = driver.findElement(By.xpath("(//img[@alt='Udemy'])[1]")).getScreenshotAs(OutputType.FILE);
		// Enterfilepath
		File f = new File("./ErrorShots/image3.jpeg");
		FileHandler.copy(temp, f);

	}

}
