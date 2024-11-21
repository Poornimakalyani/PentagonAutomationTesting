package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicsOfTestNg {
//main method testscript/testcase
	//Based on aschii value it will run lowest value to highest
	@Test
	public void Zomato() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		//for printing statement
		Reporter.log("Zomato is Launched",true);
		driver.quit();

	}
	
	@Test
	public void Swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy is Launched",true);
		driver.quit();
	}
	@Test
	public void Olafoods() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blog.olacabs.com/");
		Reporter.log("olafood is Launched",true);
		driver.quit();
	}
	@Test
	public void Dominos() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("Dominos is Launched",true);
		driver.quit();

}
}
