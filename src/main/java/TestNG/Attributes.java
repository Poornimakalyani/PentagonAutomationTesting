package TestNG;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class Attributes {
	//main method testscript/testcase
		@Test (priority =-3,invocationCount = 2)
		public void Zomato() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zomato.com/");
			//for printing statement
			Reporter.log("Zomato is Launched",true);
			driver.quit();

		}
		
		@Test (priority=5,enabled=true)
		public void Swiggy() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.swiggy.com/");
			Reporter.log("Swiggy is Launched",true);
			driver.quit();
		}
		@Test (priority=2,invocationCount = 2,threadPoolSize = 2)
		public void Olafoods() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://blog.olacabs.com/");
			Reporter.log("olafood is Launched",true);
			driver.quit();
		}
		@Test (priority= -3,dependsOnMethods="Olafoods")
		public void Dominos() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://pizzaonline.dominos.co.in/");
			Reporter.log("Dominos is Launched",true);
			driver.quit();

	}
	}


