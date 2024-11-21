package Datadriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException  {
		//same project use dot(.) and add location address
		//if diif copy full path
		
		//Path of the file
		FileInputStream fis=new FileInputStream(".\\Testdata\\testdata.properties");
		//Creating an object of property file
		Properties prop=new Properties();
		//Loading the values
		prop.load(fis);
		//Fetch the values
		String url = prop.getProperty("URL");
		
		String url1 = prop.getProperty("URL1");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.get(url1);
		
		
		

	}

}
