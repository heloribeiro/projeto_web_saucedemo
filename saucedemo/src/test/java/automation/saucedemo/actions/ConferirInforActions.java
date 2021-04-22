package automation.saucedemo.actions;

import org.openqa.selenium.WebDriver;

import automation.saucedemo.pageobjects.ConferirInforObjects;

public class ConferirInforActions {

	static ConferirInforObjects confInfo;

	public ConferirInforActions(WebDriver driver) {

		confInfo = new ConferirInforObjects(driver);
	}

	public static void inserirInformacoes() {

		confInfo.getFirstName().sendKeys("Heloisa");
		confInfo.getLastNname().sendKeys("Silva");
		confInfo.getPostalCode().sendKeys("20241040");
		confInfo.getBtnContinue().click();
	}

}
