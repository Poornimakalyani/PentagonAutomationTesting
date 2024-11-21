package WebElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.actitime.com/demo-request");

		String attribute = driver.findElement(By.linkText("Try Free")).getAttribute("class");
		System.out.println("This is the attribute value: " + attribute);

		WebElement element = driver.findElement(By.linkText("Try Free"));
		System.out.println("Location: " + element.getLocation());
		System.out.println("Tag name: " + element.getTagName());
		System.out.println("Text: " + element.getText());
		System.out.println("Cssvalues: " + element.getCssValue("background-color"));
		System.out.println("size:" + element.getSize());
		

	}

}
