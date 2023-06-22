package test.orangeweb;

import java.util.ResourceBundle;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PersonalDetailsEdit extends setupClass {

	ResourceBundle resource;
	page.orangeweb.Homepage homepage;
	page.orangeweb.Personaldetailsedit personaldetailsedit;
	Actions act;

	@Test(priority = 1)
	void toTarget() {
		validLogin("chrome");
		homepage = new page.orangeweb.Homepage(driver);
		myWait(10);
		homepage.myInfoSection.click();
		personaldetailsedit = new page.orangeweb.Personaldetailsedit(driver);
		myWait(10);
		personaldetailsedit.contactSection.click();
	}

	@Test(priority = 2, dependsOnMethods = "toTarget")
	void actualTest() throws InterruptedException {
		homepage = new page.orangeweb.Homepage(driver);
		act = new Actions(driver);

		myWait(10);
		personaldetailsedit.countryDropdown.click();
		personaldetailsedit.inputStreet1.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputStreet1.sendKeys("Street1");
		personaldetailsedit.inputStreet2.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputStreet2.sendKeys("Street2");
		personaldetailsedit.inputCity.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputCity.sendKeys("City Name");
		personaldetailsedit.inputState.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputState.sendKeys("State Name");
		personaldetailsedit.inputZipCode.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputZipCode.sendKeys("000000");
		personaldetailsedit.countryDropdown.click();
		for (int i = 0; i <= 98; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();

		personaldetailsedit.inputHomeNumber.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputHomeNumber.sendKeys("1111111111");
		personaldetailsedit.inputMobileNumber.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		personaldetailsedit.inputMobileNumber.sendKeys("0000000000");
		personaldetailsedit.buttonSubmit.click();
	}

}
