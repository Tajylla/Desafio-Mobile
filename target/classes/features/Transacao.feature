#language: pt
#enconding: UTF-8
Funcionalidade: Transacao
  
  Eu como um usuario gostaria de fazer transacoes de DESPESA E LISTAR Transacoes

  Cenario: Adicionar DUAS transacoes de DESPESA e EXCLUIR uma delas.
    Dado configuracoes iniciais concluidas
    Entao clicar no botao adicionar transacao
    E clicar no tipo transacao tela
    E clicar no insira valor tela
    E clicar na moeda tela
    E clicar no especificar conta tela
    E clicar na categoria tela
    E clicar na nova categoria tela
    E clicar na selecione data tela
    E clicar na comentario tela
    E clicar na foto tela
    E adicionar valor despesa
		E clicar na categoria transporte
		E preencher comentario gasolina
		E clicar no botao adicionar despesa
		E clicar no botao adicionar transacao
		E adicionar valor despesa2
		E clicar na categoria presentes
		E preencher comentario presentes
		E clicar no botao adicionar despesa
		E altera o periodo padrao para ano
		E alterar valor despesa
		E excluir despesa