package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutoPage {

    private WebDriver navegador;

	public ListaDeProdutoPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
    public ProdutoPage selecionarProduto (){

        //clicar em um dos produtos apresentados
        navegador.findElement(By.className("box-card")).click();
       
        //retorna a propria pagina do produto para efetuar uma nova busca
        return new ProdutoPage(navegador);
    }
    
    
}
