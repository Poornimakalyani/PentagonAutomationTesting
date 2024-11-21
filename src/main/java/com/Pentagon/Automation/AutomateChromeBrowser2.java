package com.Pentagon.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		Thread.sleep(2000);
		WebElement link=drv.findElement(By.cssSelector("input[id='name']"));
		link.sendKeys("WelCome");
		Thread.sleep(2000);
		WebElement alert_btn=drv.findElement(By.cssSelector("input[id='alertbtn']"));
		alert_btn.click();
		
		

	}

}
