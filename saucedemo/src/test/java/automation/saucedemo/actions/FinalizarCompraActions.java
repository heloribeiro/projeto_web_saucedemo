package automation.saucedemo.actions;

import org.openqa.selenium.WebDriver;

import automation.saucedemo.pageobjects.FinalizarCompraObjects;

public class FinalizarCompraActions {

	static FinalizarCompraObjects finalizar;

	public FinalizarCompraActions(WebDriver driver) {

		finalizar = new FinalizarCompraObjects(driver);

	}

	public static void clicarFinalizar() {

		finalizar.getBtnFinalizarCompra().click();
	}

}
