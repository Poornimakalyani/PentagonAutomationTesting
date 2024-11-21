package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("pal pal dil ke");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='video-title'and @class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();

	}

}
