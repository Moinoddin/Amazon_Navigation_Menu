package BaseClass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Utils.ConfigProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSetup{
	
	
	public WebDriver driver;
	public ConfigProperty prop;
	
	
	
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		prop = new ConfigProperty();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(prop.getURL());
		
	}
	
	
	@AfterMethod
	public void tearup() throws InterruptedException 
	{
		
		driver.quit();

	}
	
	
	

}
