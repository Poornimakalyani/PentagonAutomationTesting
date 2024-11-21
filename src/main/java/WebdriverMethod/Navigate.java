package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//One web page to another webpage(jump)
		Navigation navigate = driver.navigate();
		Thread.sleep(3000);
		navigate.to("https://www.facebook.com/");
		Thread.sleep(3000);
		//return to previous page
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		//last opened page will get refresh
		navigate.refresh();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
