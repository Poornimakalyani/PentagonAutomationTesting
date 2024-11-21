package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
				WebElement demo = driver.findElement(By.id("cars"));
				Select s=new Select(demo);
				s.selectByValue("90");
				s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
				s.selectByValue("299");
				s.selectByVisibleText("More Than INR 500 ( 55 )");
				s.deselectByIndex(0);
				System.out.println(s.getFirstSelectedOption().getText());
				System.out.println(s.isMultiple());
				
				List<WebElement> multi = s.getAllSelectedOptions();
				int size = multi.size();
				for(int i=0; i<size;i++) {
					String options = multi.get(i).getText();
					System.out.println(options);
					
				}
	}

}
