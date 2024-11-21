package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions setting = new ChromeOptions();
		//use any one following method to avoid notification and pass argument
		// setting.addArguments("--disable-notifications");
		setting.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.best-jobs-online.com/");

	}

}
