package page.orangeweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personaldetailsedit {

	public Personaldetailsedit(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println(this.getClass().getSimpleName() + " element loaded...");
	}

	@FindBy(xpath = "//a[normalize-space()='Contact Details']")
	public WebElement contactSection;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	public WebElement inputStreet1;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	public WebElement inputStreet2;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	public WebElement inputCity;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	public WebElement inputState;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	public WebElement inputZipCode;
	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement countryDropdown;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
	public WebElement inputHomeNumber;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	public WebElement inputMobileNumber;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement buttonSubmit;

}
