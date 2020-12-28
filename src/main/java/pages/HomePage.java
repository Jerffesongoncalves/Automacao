package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver navegador;

	public HomePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public ListaDeProdutoPage pesquisar(String produto) {
		WebElement campoPesquisa = navegador.findElement(By.id("input-search"));
		campoPesquisa.sendKeys(produto);
		WebElement btnBusca = navegador.findElement(By.id("span-searchIcon"));
		btnBusca.click();
		validarPesquisa(produto);
		return new ListaDeProdutoPage(navegador);
	}
	
	public void validarPesquisa(String produto) {
		String resultado = navegador.findElement(By.className("line-trunc")).getText();
		boolean resultadoTeste;
		if (resultado.trim().equals(produto.trim())) {
			System.out.println("Produto pesquisado com sucesso");
			resultadoTeste = true;
		}else {
			System.out.println("Produto não encontrado "+ resultado);
			resultadoTeste = false;
		}
		Assert.assertTrue(resultadoTeste);
	}
	
}
