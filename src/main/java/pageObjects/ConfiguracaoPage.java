package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Utils;

public class ConfiguracaoPage {

	public ConfiguracaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Continuar sem criar uma conta")
	private MobileElement loginSemConta;

	@AndroidFindBy(accessibility = "Começar")
	private MobileElement btnComecar;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement opcaoRealBrasileiro;
	
	@AndroidFindBy(accessibility = "Próximo")
	private MobileElement btnProximo;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement campoTexto;
	
	public void loginSemConta() throws Exception {
		System.out.println("Continuando sem uma conta...");
		loginSemConta.click();
	}
	
	public void clicarBotaoComecar() throws Exception {
		System.out.println("Clicando no botão começar...");
		btnComecar.click();
	}
	
	public void selecionarReal() throws Exception {
		System.out.println("Selecionando Moeda Real...");
		opcaoRealBrasileiro.click();
	}
	
	public void filtrarReal() throws Exception {
		System.out.println("Filtrando Real...");
		Utils.inputTextAppiumCommand(campoTexto, "Real");
	}
	
	public void definirValorInicial() throws Exception {
		System.out.println("Atribuindo valor inicial de 100.00...");
		Utils.inputTextAppiumCommand(campoTexto, "100");
	}
	
	public void clicarProximo() throws Exception {
		System.out.println("Clicando em próximo...");
		btnProximo.click();
	}


}
