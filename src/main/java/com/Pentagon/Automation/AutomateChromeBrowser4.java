package com.Pentagon.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		Thread.sleep(2000);
		WebElement rad=drv.findElement(By.cssSelector("input[id='pythonradio']"));
		rad.click();
		String txt=rad.getAttribute("Value");
		if(rad.isSelected()) {
			System.out.println("You Have selected"+txt);
		}
		
	
	}

}
