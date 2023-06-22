package page.orangeweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editprofileinfo {
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lastName;

	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]")
	public WebElement nickName;

	@FindBy(xpath = "//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/div[2]/i")
	public WebElement nationalityDropDown;

	@FindBy(xpath = "//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div")
	public WebElement dropDownOption;

	public Editprofileinfo(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 System.out.println(this.getClass().getSimpleName()+" elements loaded...");
	}
}
