package com.Pentagon.Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the name of the Element to be Choosen");
		String ename=s.next();// give input hondacheck
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.navigate().to("file:///C:/Users/Admin/OneDrive/Desktop/demopage.html");
		Thread.sleep(1000);
		WebElement wele=drv.findElement(By.cssSelector("input[id='"+ename+"']"));
		wele.click();
		System.out.println(wele.getAttribute("value"));
		
		

	}

}
