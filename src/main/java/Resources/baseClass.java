package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//This will help us to write the browser related code 
public class baseClass {

	public WebDriver driver;
	public Properties prop;
	
	public static String emailAddress = generateRandoEmailID();//test@gmail.com
	

	public void initalizeDriver() throws IOException {

		// This will help us to read the file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Pleaase choose the correct browse");
		}

	}
	
	
	public static String generateRandoEmailID() {
		
		return "test"+System.currentTimeMillis()+"@gmail.com";
		
		// test123455632232@gmail.com
		
		
		
	}
	
	@BeforeMethod
	public void browserlaunch() throws IOException {
		
	initalizeDriver();
	String url = prop.getProperty("URL");
	driver.get(url);
	

	}
	
	//@AfterMethod
	
	//public void closebrowser() {
		//driver.quit();
	}
	
//}
