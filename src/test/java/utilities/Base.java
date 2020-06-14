package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	protected WebDriver driver;
	public Properties prop;
	private String propertyLocation = "src\\\\main\\\\java\\\\properties\\\\app.properties";
	//String driverPath = "C:\\webdrivers";
	
	
	 @BeforeClass 
	 public void beforeClass() throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe"); 
		//driver = new ChromeDriver(); 
		 
		 //initializing property file
		 prop = new Properties();
			FileInputStream fis = new FileInputStream(propertyLocation);
			prop.load(fis);
			String browserType = prop.getProperty("browser");
	 
	 if(browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
	 }else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
	 }else if (browserType.equals("IE")) {	
			System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
	 }else { 
		 System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();	 }	
			
	 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	 
	 }
	 @AfterClass
		public void aftherClass() {
			//driver.quit();
			
		}
	 
}
