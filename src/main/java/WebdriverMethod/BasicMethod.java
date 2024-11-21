package WebdriverMethod;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		//oR
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		//everytime we get unique ids
		driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		driver.quit();
		

	}

}
