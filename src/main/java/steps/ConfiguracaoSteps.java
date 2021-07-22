package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pageObjects.ConfiguracaoPage;

public class ConfiguracaoSteps {

	ConfiguracaoPage c = new ConfiguracaoPage(driver);

	@Dado("tela de login entrar sem conta")
	public void tela_de_login_entrar_sem_conta() throws Exception {
		c.loginSemConta();
		Thread.sleep(500);
	}

	@E("clicar no botao comecar")
	public void clicar_no_botao_comecar() throws Exception {
		c.clicarBotaoComecar();
		Thread.sleep(500);
	}
	
	@E("filtrar real")
	public void filtrar_real() throws Exception {
		c.filtrarReal();
		Thread.sleep(500);
	}
	
	@E("selecionar real")
	public void selecionar_real() throws Exception {
		c.selecionarReal();
		Thread.sleep(500);
	}
	
	@E("clicar no botao proximo")
	public void clicar_no_botao_proximo() throws Exception {
		c.clicarProximo();
		Thread.sleep(500);
	}
	
	@E("definir valor inicial")
	public void definir_valor_inicial() throws Exception {
		c.definirValorInicial();
		Thread.sleep(500);
	}
	
	@Dado("configuracoes iniciais concluidas")
	public void configuracoes_iniciais_concluidas() throws Exception {
		this.tela_de_login_entrar_sem_conta();
		this.clicar_no_botao_comecar();
		this.filtrar_real();
		this.selecionar_real();
		this.definir_valor_inicial();
		this.clicar_no_botao_proximo();
	}

}
