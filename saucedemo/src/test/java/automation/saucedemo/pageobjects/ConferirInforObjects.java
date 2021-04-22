package automation.saucedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConferirInforObjects {

	private WebDriver driver;

	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastNname;

	@FindBy(id = "postal-code")
	private WebElement postalCode;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public ConferirInforObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastNname() {
		return lastNname;
	}

	public void setLastNname(WebElement lastNname) {
		this.lastNname = lastNname;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(WebElement postalCode) {
		this.postalCode = postalCode;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

}
