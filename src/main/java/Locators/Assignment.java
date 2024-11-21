package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("kesariya");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='style-scope ytd-watch-metadata'])[1]")).click();
		//click on song title then inspect
		driver.findElement(By.xpath("//a[@id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		
		

	}

}
