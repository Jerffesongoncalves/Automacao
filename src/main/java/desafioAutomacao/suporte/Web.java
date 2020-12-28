package desafioAutomacao.suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web {

	public static WebDriver createChrome(){
        //abre navegador
        System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        navegador.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        

        //navega até o site da loja
        navegador.get("https://www.livelo.com.br/");

        return navegador;
    }
}
