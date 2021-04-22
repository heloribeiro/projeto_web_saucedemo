package automation.saucedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {

	private WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement inputUserName;

	@FindBy(id = "password")
	private WebElement inputSenha;

	@FindBy(id = "login-button")
	private WebElement btnLogin;

	// Cria o construtor do Driver
	public LoginObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getInputUserName() {
		return inputUserName;
	}

	public void setInputUserName(WebElement inputUserName) {
		this.inputUserName = inputUserName;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(WebElement inputSenha) {
		this.inputSenha = inputSenha;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

}
