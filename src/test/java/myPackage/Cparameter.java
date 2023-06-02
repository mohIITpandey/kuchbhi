package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cparameter {
@Test
public void checkBrowser() {
	WebDriver driver;
	String BROWSER=System.getProperty("browSer");
	String Url=System.getProperty("Url");
	if(BROWSER.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(BROWSER.equalsIgnoreCase("firefox")){
		driver= new FirefoxDriver();
	}else if(BROWSER.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}else {
		driver=new ChromeDriver();
	}
	driver.get(Url);
	driver.close();
 }
}

