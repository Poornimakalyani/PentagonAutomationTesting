package Launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//To open specific page
		driver.get("https://www.google.com/");
		//To maximize
		driver.manage().window().maximize();

	}

}
