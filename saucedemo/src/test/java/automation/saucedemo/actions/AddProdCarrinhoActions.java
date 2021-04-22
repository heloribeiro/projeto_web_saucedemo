package automation.saucedemo.actions;

import org.openqa.selenium.WebDriver;

import automation.saucedemo.pageobjects.AddProdCarrinhoObjects;

public class AddProdCarrinhoActions {

	static AddProdCarrinhoObjects addProd;

	public AddProdCarrinhoActions(WebDriver driver) {

		addProd = new AddProdCarrinhoObjects(driver);
	}

	public static void adicionarProduto() {

		addProd.getAddProduto().click();
		addProd.getClicarCarrinho().click();

	}

}
