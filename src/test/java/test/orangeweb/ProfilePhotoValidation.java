package test.orangeweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ProfilePhotoValidation extends setupClass{
	
	page.orangeweb.Homepage homepage;
	page.orangeweb.Profilephotovalidation profilephotovalidation;
	
	@Test(priority=1)
	void toTarget() throws InterruptedException {
		validLogin("chrome");
		homepage = new page.orangeweb.Homepage(driver);
		myWait(10);
		homepage.myInfoSection.click();
		profilephotovalidation = new page.orangeweb.Profilephotovalidation(driver);
		myWait(10);
	}
	
	@Test(priority=2)
	void validFileType() throws InterruptedException {
		//jpg file under 1 mb
		profilephotovalidation.profileImage.click();
		profilephotovalidation.fileLocation.sendKeys("C:\\Users\\vodil\\Desktop\\Jobs\\vyankatesh_Image2.jpeg");
		Thread.sleep(3000);		
	}
	
	@Test(priority=3)
	void InvalidFileType() throws InterruptedException{		
		//other file under 1 mb
		profilephotovalidation.profileImage.click();
		profilephotovalidation.fileLocation.sendKeys("C:\\Users\\vodil\\Desktop\\Jobs\\Resume Format.pdf");
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText();
		System.out.println(msg);

	}
	
}
