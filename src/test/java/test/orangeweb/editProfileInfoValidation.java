package test.orangeweb;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class editProfileInfoValidation extends setupClass{
	page.orangeweb.Homepage homepage;
	page.orangeweb.Editprofileinfo editprofileinfo;
	Select select;
	
	@Test(priority=1)
	void toTarget(){
		validLogin("chrome");
		homepage = new page.orangeweb.Homepage(driver);
		myWait(10);
		homepage.myInfoSection.click();
		homepage.profileMenu.click();
	}
	

	@Test(priority=2)
	void actualTest() throws InterruptedException{
		editprofileinfo = new page.orangeweb.Editprofileinfo(driver);
		myWait(10);
		editprofileinfo.firstName.sendKeys("Samual");
		editprofileinfo.middleName.sendKeys("John");
		editprofileinfo.lastName.sendKeys("Miller");
		editprofileinfo.nickName.sendKeys("Sam");
		editprofileinfo.nationalityDropDown.click();
		editprofileinfo.dropDownOption.click();
		Thread.sleep(4000);
	}
}
