package com.Pentagon.Automation;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		Thread.sleep(2000);
		
		ArrayList<WebElement> rad_buttons=(ArrayList<WebElement>) drv.findElements(By.cssSelector("input[type='radio']"));
		
		for (WebElement webElement : rad_buttons) {
			webElement.click();
			if(webElement.isSelected()) {
				System.out.println("You have selected"+webElement.getAttribute("value"));
			
		}
			Thread.sleep(3000);
			
		}

	}

}
