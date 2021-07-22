package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Utils;

public class TransacaoPage {
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
	private MobileElement btnAdicionar;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement campoTexto;
	
	@AndroidFindBy(accessibility = "Selecionar o tipo de transação")
	private MobileElement tipoTransacaoTela;
	
	@AndroidFindBy(accessibility = "Insira o valor")
	private MobileElement insiraValorTela;
	
	@AndroidFindBy(accessibility = "Salvar")
	private MobileElement btnSalvar;
	
	@AndroidFindBy(accessibility = "Selecione a moeda da transação")
	private MobileElement moedaTela;
	
	@AndroidFindBy(accessibility = "Especificar conta")
	private MobileElement especificarContaTela;
	
	@AndroidFindBy(accessibility = "Selecionar um ícone para a categoria")
	private MobileElement categoriaTela;
	
	@AndroidFindBy(accessibility = "Case necessário, adicione uma nova categoria")
	private MobileElement novaCategoriaTela;
	
	@AndroidFindBy(accessibility = "Selecione a data")
	private MobileElement selecioneDataTela;
	
	@AndroidFindBy(accessibility = "Adicionar comentário")
	private MobileElement adicionarComentarioTela;
	
	@AndroidFindBy(accessibility = "Você pode adicionar uma foto")
	private MobileElement fotoTela;
	
	@AndroidFindBy(accessibility = "Transporte")
	private MobileElement categoriaTransporte;
	
	@AndroidFindBy(accessibility = "Presentes")
	private MobileElement categoriaPresentes;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Comentário']")
	private MobileElement campoComentario;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Gasolina do Carro, Comentário']")
	private MobileElement campoComentarioEditar;
	
	@AndroidFindBy(accessibility = "Adicionar")
	private MobileElement btnAdicionarDespesa;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']")
	private MobileElement datasSelecao;
	
	@AndroidFindBy(accessibility = "Abrir menu de navegação")
	private MobileElement acaoMenu;
	
	@AndroidFindBy(accessibility = "Configurações")
	private MobileElement configuracoesMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='5']")
	private MobileElement periodoPadrao;
	
	@AndroidFindBy(accessibility = "Ano")
	private MobileElement periodoPadraoAno;
	
	@AndroidFindBy(accessibility = "Gráfico")
	private MobileElement graficoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[42,1415][1038,1583]']")
	private MobileElement primeiraDespesa;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[42,431][1038,588]']")
	private MobileElement selecionarDespesa;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	private MobileElement editar;
	
	@AndroidFindBy(accessibility = "EXCLUIR")
	private MobileElement btnExcluir;
	
	@AndroidFindBy(accessibility = "SIM")
	private MobileElement btnConfirmarExclusao;
	
	@AndroidFindBy(accessibility = "Voltar")
	private MobileElement btnVoltar;
	
	public TransacaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void btnAdicionarTransacoes() throws Exception {
		btnAdicionar.click();
	}
	
	public void adicionarValorDespesa(String valor) throws Exception {
		Utils.inputTextAppiumCommand(campoTexto, valor);
	}
	
	public void clicarTipoTransacaoTela() throws Exception {
		tipoTransacaoTela.click();
	}
	
	public void clicarInsiraValorTela() throws Exception {
		insiraValorTela.click();
	}
	
	public void clicarMoedaTela() throws Exception {
		moedaTela.click();
	}
	
	public void clicarEspecificarContaTela() throws Exception {
		especificarContaTela.click();
	}
	
	public void clicarCategoriaTela() throws Exception {
		categoriaTela.click();
	}
	
	public void clicarNovaCategoriaTela() throws Exception {
		novaCategoriaTela.click();
	}
	
	public void clicarSelecioneDataTela() throws Exception {
		selecioneDataTela.click();
	}
	
	public void clicarComentarioTela() throws Exception {
		adicionarComentarioTela.click();
	}
	
	public void clicarFotoTela() throws Exception {
		fotoTela.click();
	}
	
	public void clicarCategoriaTransportes() {
		categoriaTransporte.click();
	}
	
	public void clicarCategoriaPresente() {
		categoriaPresentes.click();
	}
	
	public void prencherComentario(String descricao) throws Exception {
		Utils.inputTextAppiumCommand(campoComentario, descricao);
	}
	
	public void clicarAdicionarDespesa() {
		datasSelecao.click();
		btnAdicionarDespesa.click();
	}
	
	public void alterarDespesa() throws Exception {
		primeiraDespesa.click();
		selecionarDespesa.click();
		editar.click();
		Utils.inputTextAppiumCommand(campoTexto, "900");
		categoriaTransporte.click();
		Utils.inputTextAppiumCommand(campoComentarioEditar, " e Alcool da moto");
		datasSelecao.click();
		btnSalvar.click();
	}
	
	public void excluirDespesa() {
		btnExcluir.click();
		btnConfirmarExclusao.click();
		btnVoltar.click();
	}
	
	public void alterarPeriodoPadrao() {
		acaoMenu.click();
		configuracoesMenu.click();
		periodoPadrao.click();
		periodoPadraoAno.click();
		acaoMenu.click();
		graficoMenu.click();
	}
	
}
