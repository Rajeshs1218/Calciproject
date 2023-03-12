package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBasecheck {
	public static Properties prop;
	public static FileInputStream fip;
	public static String Browser;
	public static WebDriver driver;
	public static int tc = 0;

	public static void OpenBrowser() throws Throwable {
		//fip = new FileInputStream(".\\src\\test\\java\\com\\config\\Or.Properties");
		fip= new FileInputStream(".\\src\\main\\java\\Config\\Or.Properties");
		prop = new Properties();
		prop.load(fip);
		Browser = prop.getProperty("Browser");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(options); // OpenBrowser
			
			
			
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver1.exe");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url")); // open url
		driver.manage().window().maximize(); // maximize browser

}
	
	public static void CloseBrowser() {
		driver.quit();
}

}