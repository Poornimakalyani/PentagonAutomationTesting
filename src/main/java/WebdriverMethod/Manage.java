package WebdriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		Dimension before = driver.manage().window().getSize();
		System.out.println(before);
		driver.manage().window().maximize();
		Dimension after = driver.manage().window().getSize();
		System.out.println(after);
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		driver.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(1000);
		//Window starting point x and y axis
		driver.manage().window().getPosition();
		System.out.println(driver.manage().window().getPosition());
		//OR
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.manage().window().setPosition(new Point(300,300));
		Thread.sleep(1000);
		driver.quit();
		

	}

}
