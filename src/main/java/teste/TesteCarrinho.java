package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import desafioAutomacao.suporte.Web;
import pages.HomePage;


public class TesteCarrinho {

	private WebDriver navegador;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("*******************************");
		System.out.println("*          Inicio Teste       *");
		System.out.println("*******************************");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("*******************************");
		System.out.println("*          Fim Teste          *");
		System.out.println("*******************************");
	}
	
	@Before
	 public void setUp(){
	navegador = Web.createChrome();
	}
	
	@Test
	public void testandoCarrinho() {
		
		new HomePage(navegador)
		.pesquisar("Fritadeira Elétrica sem Óleo/Air Fryer Nell Fit - Preto 3,2L com Timer")
		.selecionarProduto()
		.adicionarAoCarrinho();
	}
	
	@After
    public void tearDown(){
        navegador.quit();
    }
}
