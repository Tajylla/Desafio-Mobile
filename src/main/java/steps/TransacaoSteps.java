package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.TransacaoPage;

public class TransacaoSteps {

	TransacaoPage t = new TransacaoPage(driver);

	@Entao("clicar no botao adicionar transacao")
	public void clicar_no_botao_adicionar_transacao() throws Exception {
		System.out.println("Clicando botao adicionar transacao...");
		t.btnAdicionarTransacoes();
		Thread.sleep(300);
	}
	
	@E("adicionar valor despesa")
	public void adicionarValorDespesa() throws Exception {
		System.out.println("Adicionando despesa de R$ 300,00...");
		t.adicionarValorDespesa("300");
		Thread.sleep(2000);
	}
	
	@E("clicar no tipo transacao tela")
	public void clicar_no_tipo_transacao_tela() throws Exception {
		System.out.println("Clicando na primeira tela...");
		t.clicarTipoTransacaoTela();
		Thread.sleep(300);
	}
	
	@E("clicar no insira valor tela")
	public void clicar_no_insira_valor_tela() throws Exception {
		System.out.println("Clicando na Segunda tela...");
		t.clicarInsiraValorTela();
		Thread.sleep(300);
	}
	
	@E("clicar na moeda tela")
	public void clicar_na_moeda_tela() throws Exception {
		System.out.println("Clicando na Terceira tela...");
		t.clicarMoedaTela();
		Thread.sleep(300);
	}
	
	@E("clicar no especificar conta tela")
	public void clicar_no_especificar_conta_tela() throws Exception {
		System.out.println("Clicando na Quarta tela...");
		t.clicarEspecificarContaTela();
		Thread.sleep(300);
	}
	
	@E("clicar na categoria tela")
	public void clicar_na_categoria_tela() throws Exception {
		System.out.println("Clicando na Quinta tela...");
		t.clicarCategoriaTela();
		Thread.sleep(300);
	}
	
	@E("clicar na nova categoria tela")
	public void clicar_na_nova_categoria_tela() throws Exception {
		System.out.println("Clicando na Sexta tela...");
		t.clicarNovaCategoriaTela();
		Thread.sleep(300);
	}
	
	@E("clicar na selecione data tela")
	public void clicar_na_selecione_data_tela() throws Exception {
		System.out.println("Clicando na Setima tela...");
		t.clicarSelecioneDataTela();
		Thread.sleep(300);
	}
	
	@E("clicar na comentario tela")
	public void clicar_na_comentario_tela() throws Exception {
		System.out.println("Clicando na Oitava tela...");
		t.clicarComentarioTela();
		Thread.sleep(300);
	}
	
	@E("clicar na foto tela")
	public void clicar_na_foto_tela() throws Exception {
		System.out.println("Clicando na Nona tela...");
		t.clicarFotoTela();
		Thread.sleep(300);
	}
	
	@E("clicar na categoria transporte")
	public void clicar_na_categoria_transporte() throws Exception {
		System.out.println("Clicando categoria transporte...");
		t.clicarCategoriaTransportes();
		Thread.sleep(300);
	}
	
	@E("clicar na categoria presentes")
	public void clicar_na_categoria_presentes() throws Exception {
		System.out.println("Clicando categoria presentes...");
		t.clicarCategoriaPresente();
		Thread.sleep(300);
	}
	
	@E("preencher comentario gasolina")
	public void preencher_comentario_gasolina() throws Exception {
		System.out.println("Escrevendo Comentário Gasolina...");
		t.prencherComentario("Gasolina do Carro");
		Thread.sleep(300);
	}
	
	@E("adicionar valor despesa2")
	public void adicionarValorDespesa2() throws Exception {
		System.out.println("Adicionando despesa de R$ 750,00...");
		t.adicionarValorDespesa("750");
		Thread.sleep(2000);
	}
	
	@E("preencher comentario presentes")
	public void preencher_comentario_presentes() throws Exception {
		System.out.println("Escrevendo Comentário Presentes...");
		t.prencherComentario("Presente dia das maes");
		Thread.sleep(300);
	}
	
	@E("clicar no botao adicionar despesa")
	public void clicar_no_botao_adicionar_despesa() throws Exception {
		System.out.println("Clicando no botão adicionar despesa...");
		t.clicarAdicionarDespesa();
		Thread.sleep(300);
	}
	
	@E("altera o periodo padrao para ano")
	public void altera_o_periodo_padrao_para_ano() throws Exception {
		System.out.println("Alterando o periodo padrão para ANO...");
		t.alterarPeriodoPadrao();
		Thread.sleep(2000);
	}
	
	@E("alterar valor despesa")
	public void alterar_valor_segunda_despesa() throws Exception {
		System.out.println("Alterando valor despesa...");
		t.alterarDespesa();
		Thread.sleep(2000);
	}
	
	@E("excluir despesa")
	public void excluir_despesa() throws Exception {
		System.out.println("Excluindo despesa...");
		t.excluirDespesa();
		Thread.sleep(2000);
	}
	

}
