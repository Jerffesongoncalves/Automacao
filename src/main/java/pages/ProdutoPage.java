package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdutoPage {

	 //variavel do tipo webdriver
    private WebDriver navegador;

	public ProdutoPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	//método para adicionar produto ao carrinho
    public ProdutoPage adicionarAoCarrinho(){
    	/* valida a voltagem antes de adicionar ao carrinho */
    	navegador.findElement(By.xpath("//select[@class='group__select']/option[2]")).click();
   	
        /*executa ação que adiciona o produto a carrinho de compras*/
        navegador.findElement(By.id("cc-prodDetails-addToCart")).click();

        //cria variável para salvar do tipo webdriver wait
        WebDriverWait aguardar = new WebDriverWait(navegador, 10);
       
        // validacoes sobre os produtos adicionados ao carrinho
        //assertEquals("Faded Short Sleeve T-shirts", navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText());
        
    
     
        return this;
    }

    
}
