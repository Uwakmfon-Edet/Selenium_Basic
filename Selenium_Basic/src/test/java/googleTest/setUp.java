package googleTest;

import java.io.IOException;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class setUp {

	public static WebDriver driver;  

	@BeforeSuite     
	public void initializeWebDriver() throws IOException {  

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();  
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		}

		catch (Exception exp) {
			System.out.println("The cause is: " +exp.getCause());
			System.out.println("The message is: " +exp.getMessage());
			exp.printStackTrace();
		}

	}

	@AfterSuite  
	public void quitDriver() {  
		driver.quit();  
	}  

}