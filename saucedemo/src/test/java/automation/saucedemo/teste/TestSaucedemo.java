package automation.saucedemo.teste;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.saucedemo.actions.AddProdCarrinhoActions;
import automation.saucedemo.actions.ConferirInforActions;
import automation.saucedemo.actions.FinalizarCompraActions;
import automation.saucedemo.actions.LoginActions;
import automation.saucedemo.actions.VerificarCarrinhoActions;

class TestSaucedemo {

	static WebDriver driver;
	static LoginActions actlog;
	static AddProdCarrinhoActions actaddprod;
	static VerificarCarrinhoActions verif;
	static ConferirInforActions confInfo;
	static FinalizarCompraActions finalComp;

	@BeforeAll
	static void msgInicial() {

		System.out.println("Teste Iniciados");
	}

	@BeforeEach
	void inicializarPagina() {

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		// Acessar Página
		driver.get("https://www.saucedemo.com/");

		// Maximar Página
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		// Instanciar as Actions
		actlog = new LoginActions(driver);
		actaddprod = new AddProdCarrinhoActions(driver);
		verif = new VerificarCarrinhoActions(driver);
		confInfo = new ConferirInforActions(driver);
		finalComp = new FinalizarCompraActions(driver);

	}

	@Test
	void realizarProcessoDeCompra() throws Exception {

		// Logar com usuário e senha
		actlog.LogarUsuario();

		// Adicionar o produto no carrinho
		actaddprod.adicionarProduto();

		// verificar o que foi colocado no carrinho
		verif.verificarCompra();

		// Inserir as Informações (Nome, Código Postal)
		confInfo.inserirInformacoes();

		// Finalizar a Comprar
		finalComp.clicarFinalizar();

	}

	@AfterEach
	void fecharPagina() {

		driver.close();
	}

}
