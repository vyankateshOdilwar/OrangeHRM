package page.orangeweb;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	public WebElement profileMenu;

	@FindBy(linkText = "About")
	public WebElement about;

	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']")
	public List<WebElement> companyDetails;

	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	public WebElement dashboard;

	@FindBy(linkText = "My Info")
	public WebElement myInfoSection;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("homePage elements loaded...");
	}
}