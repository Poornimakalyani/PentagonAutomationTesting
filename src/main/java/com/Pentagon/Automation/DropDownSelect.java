package com.Pentagon.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		Thread.sleep(3000);
		WebElement drop_down=drv.findElement(By.id("countryselect"));
		Select selection=new Select(drop_down);
		selection.selectByVisibleText("Bangladesh");
		Thread.sleep(3000);
		selection.selectByIndex(4);
		Thread.sleep(3000);
		selection.selectByValue("Srilanka");
		

	}

}
