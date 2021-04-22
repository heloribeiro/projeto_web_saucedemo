package automation.saucedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalizarCompraObjects {

	private WebDriver driver;

	@FindBy(id = "finish")
	private WebElement btnFinalizarCompra;

	public FinalizarCompraObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getBtnFinalizarCompra() {
		return btnFinalizarCompra;
	}

	public void setBtnFinalizarCompra(WebElement btnFinalizarCompra) {
		this.btnFinalizarCompra = btnFinalizarCompra;
	}

}
