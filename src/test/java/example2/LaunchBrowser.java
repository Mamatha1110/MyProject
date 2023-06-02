package example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

	@Test
	public void launchBrowserTest()
	{
		WebDriver driver;
		
		String browser = System.getProperty("Browser");
		String url = System.getProperty("URL");
		
		System.out.println(browser);
		System.out.println(url);
		
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		
		driver.get(url);
		
	}
	
}
