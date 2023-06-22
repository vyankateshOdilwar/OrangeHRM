package page.orangeweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilephotovalidation {
	@FindBy(xpath = "//img[@class='employee-image']")
	public WebElement profileImage;

	@FindBy(xpath = "//button[@class='oxd-icon-button employee-image-action']")
	public WebElement uploadImageButton;

	@FindBy(xpath = "//input[@type='file']")
	public WebElement fileLocation;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButton;

	public Profilephotovalidation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println(this.getClass().getSimpleName()+" element loaded...");
	}
}
