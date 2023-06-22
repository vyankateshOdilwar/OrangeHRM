package test.orangeweb;

import java.util.ResourceBundle;

import org.testng.annotations.Test;


public class homePage extends setupClass{

	page.orangeweb.Homepage homepage;
	ResourceBundle resource;
	page.orangeweb.Loginpage loginpage;

	@Test
	void profilecheck() throws InterruptedException {
		resource = ResourceBundle.getBundle("config");
		setup("chrome",resource.getString("URL"));
		loginpage = new page.orangeweb.Loginpage(driver);
		loginpage.username.sendKeys(resource.getString("USERNAME"));
		loginpage.password.sendKeys(resource.getString("PASSWORD"));
		loginpage.button.click();
		homepage = new page.orangeweb.Homepage(driver);
		myWait(10);
		homepage.myInfoSection.click();
		Thread.sleep(3000);		
	}	
}
