package com.Pentagon.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser1 {
	
	public static void main(String[]args) {
		
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		WebElement link=drv.findElement(By.tagName("a"));
		link.click();
	}

}
