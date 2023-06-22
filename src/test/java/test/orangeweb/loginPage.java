package test.orangeweb;


import java.util.ResourceBundle;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(test.orangeweb.ListenerClass.class)
public class loginPage extends setupClass {
	

	page.orangeweb.Loginpage loginpage;
	page.orangeweb.Homepage homepage;
	ResourceBundle resource ;
	
	
	@Test(priority = 1)
	void initElements() {
		resource = ResourceBundle.getBundle("config");
		setup("chrome", resource.getString("URL"));
	}
	
	@Test (priority = 2, dataProvider = "testData")
	void loginTest(String username, String password) throws InterruptedException {
		loginpage = new page.orangeweb.Loginpage(driver);
		myWait(10);
		
		loginpage.username.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		loginpage.username.sendKeys(username);
		loginpage.password.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		loginpage.password.sendKeys(password);
		loginpage.button.click();
		Thread.sleep(3000);
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		if(expectedURL.equals(driver.getCurrentUrl())) {
			System.out.println("Given details are Valid \n"+username+" | "+password);
			driver.navigate().back();
		}else {
			System.out.println("Given details are Invalid \n"+username+" | "+password);
		}
	}
		
	@DataProvider(name="testData")
	Object[][] testData() {
		resource = ResourceBundle.getBundle("config");
		Object[][] data = {
				{resource.getString("USERNAME"), resource.getString("PASSWORD")},//valid username & valid password
				{resource.getString("USERNAME"),"invalid_Password"}, //valid username & invalid password
				{"invalid_username",resource.getString("PASSWORD")}, //invalid username & valid password
				{"invalid_username","invalid_password"}//invalid username & invalid password
		};
		return data;
	}
}
