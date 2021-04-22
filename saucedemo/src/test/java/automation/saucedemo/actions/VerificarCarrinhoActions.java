package automation.saucedemo.actions;

import org.openqa.selenium.WebDriver;

import automation.saucedemo.pageobjects.VerificarCarrinhoObjects;

public class VerificarCarrinhoActions {

	static VerificarCarrinhoObjects vrfCarr;

	public VerificarCarrinhoActions(WebDriver driver) {

		vrfCarr = new VerificarCarrinhoObjects(driver);
	}

	public static void verificarCompra() {

		vrfCarr.getBtnCheckout().click();
	}

}
