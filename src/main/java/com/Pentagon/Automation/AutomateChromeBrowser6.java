package com.Pentagon.Automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChromeBrowser6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/Downloads/checkbox.html");
		Thread.sleep(2000);

		ArrayList<WebElement> chk_btns = (ArrayList<WebElement>) drv.findElements(By.cssSelector("input[type='checkbox']"));

		for (int i = 0; i < chk_btns.size(); i++) 
		{
			if (i % 2 == 0) {
				chk_btns.get(i).click();
				Thread.sleep(2000);
			}
		}
		for (int i = chk_btns.size() - 1; i >= 0; i--) {
			chk_btns.get(i).click();
			Thread.sleep(2000);
		}
		//tagname[attribute='value']
	}

}
