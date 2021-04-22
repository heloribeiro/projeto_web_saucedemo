package automation.saucedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProdCarrinhoObjects {

	private WebDriver driver;

	@FindBy(css = "button#add-to-cart-sauce-labs-backpack")
	private WebElement addProduto;

	@FindBy(id = "shopping_cart_container")
	private WebElement clicarCarrinho;

	public AddProdCarrinhoObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getAddProduto() {
		return addProduto;
	}

	public void setAddProduto(WebElement addProduto) {
		this.addProduto = addProduto;
	}

	public WebElement getClicarCarrinho() {
		return clicarCarrinho;
	}

	public void setClicarCarrinho(WebElement clicarCarrinho) {
		this.clicarCarrinho = clicarCarrinho;
	}

}
