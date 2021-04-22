package automation.saucedemo.actions;

import org.openqa.selenium.WebDriver;

import automation.saucedemo.pageobjects.LoginObjects;

public class LoginActions {

	static LoginObjects log;

	public LoginActions(WebDriver driver) {

		log = new LoginObjects(driver);

	}

	public static void LogarUsuario() {

		log.getInputUserName().sendKeys("standard_user");
		log.getInputSenha().sendKeys("secret_sauce");
		log.getBtnLogin().click();
	}

}
