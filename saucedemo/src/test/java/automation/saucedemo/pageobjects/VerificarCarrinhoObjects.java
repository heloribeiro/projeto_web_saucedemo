package automation.saucedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificarCarrinhoObjects {

	private WebDriver driver;

	@FindBy(className = "checkout_button")
	private WebElement btnCheckout;

	public VerificarCarrinhoObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getBtnCheckout() {
		return btnCheckout;
	}

	public void setBtnCheckout(WebElement btnCheckout) {
		this.btnCheckout = btnCheckout;
	}

}
