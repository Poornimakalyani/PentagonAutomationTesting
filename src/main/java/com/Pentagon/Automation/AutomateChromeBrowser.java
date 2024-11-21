package com.Pentagon.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drv=new ChromeDriver();
		
		// To maximize the window 
		drv.manage().window().maximize();
		//To open up specific web page
		drv.get("https://google.com");
		String expected_title="Google";
		String actual_title=drv.getTitle();
		System.out.println(expected_title.equals(actual_title));
		WebElement search_Box=drv.findElement(By.name("q"));
		
		search_Box.sendKeys("Testing");

	}

}
