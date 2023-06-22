package test.orangeweb;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupClass {
	
public static WebDriver driver;

	ResourceBundle resource;
	page.orangeweb.Loginpage loginpage;

	  public void setup(String browser, String URL) {
		  
		  if(browser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			  driver.get(URL);
		  } else if(browser.equalsIgnoreCase("edge")) {
			  WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			  driver.get(URL);
		  }else{
			  System.out.println("Invalid Parameters!");
		  }
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  public void validLogin(String BrowserName) {
			resource = ResourceBundle.getBundle("config");
			setup(BrowserName, resource.getString("URL"));
			loginpage = new page.orangeweb.Loginpage(driver);
			myWait(10);
			loginpage.username.sendKeys(resource.getString("USERNAME"));
			loginpage.password.sendKeys(resource.getString("PASSWORD"));
			loginpage.button.click();
			myWait(10);
	  }
	  
	  public void myWait(int waitInSeconds) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSeconds));
	  }
	  
	  @AfterClass
	  void tearDown() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.quit();
	  }
	  	
}
