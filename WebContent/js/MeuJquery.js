$(document).ready(function () {

  $(".estoque").text("Estoque")
  $(".financeiro").text("Financeiro")
  $(".producao").text("Produção")



/*Produção JS*/
$(".some").hide();

$("#costura").hide();
$("#pacote").hide();
$("#montagem").hide();

$(".a").click(function() {
	$("#costura").show();
	$("#pacote").show();
	$("#montagem").show();	
})
$(".aparece").click(function() {
	$(".some").show();
})

$("#producao_costura").hide();
$("#producao_monatagem").hide();
$("#producao_empacotamento").hide();
$(".some").hide();

$("#mostar_costura").click(function() {
	$("#producao_costura").toggle();
	$("#producao_monatagem").hide();
	$("#producao_empacotamento").hide();
	$(".some").hide();		
	$("#costura").hide();
	$("#pacote").hide();
	$("#montagem").hide();
})

$("#mostar_montagem").click(function() {
	$("#producao_costura").hide();
	$("#producao_monatagem").toggle();
	$("#producao_empacotamento").hide();
	$(".some").hide();
	$("#costura").hide();
	$("#pacote").hide();
	$("#montagem").hide();
})

$("#mostra_pacote").click(function() {
	$("#producao_costura").hide();
	$("#producao_monatagem").hide();
	$("#producao_empacotamento").toggle();
	$(".some").hide();
	$("#costura").hide();
	$("#pacote").hide();
	$("#montagem").hide();
})

	
	

	/*Finceiro js*/
	$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();

	
	$("#mostrar_pedidos").click(function(){
		$("#pedidos_cadastro").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
		
	})

	$("#mostrar_fornecedor").click(function(){
		$("#fornecedores_cadastro").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	})

	$("#mostrar_cliente").click(function(){
		$("#cliente_cadastro").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	})
	
	$("#por_cliente").click(function(){
		$("#pesquisa_Cliente").toggle();
		$("#tabela_tudo").show();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_pedido").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	})

	$("#por_fornecedor").click(function(){
		$("#pesquisa_fornecedor").toggle();
		$("#tabela_tudo").show();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	})
	
	$("#por_pedido").click(function(){
		$("#pesquisa_pedido").toggle();
		$("#tabela_tudo").show();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	})
	
	$("#remover_cliente").click(function(){
		$("#cliente_delete").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide(); 
	})
	
	$("#remove_pedido").click(function(){
		$("#pedido_delete").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	})

	$("#remove_fornecedor").click(function(){
		$("#fornecedor_delete").toggle();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedores_cadastro").hide();
	})
	
	






/*Estoque solicitação JS*/
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_solicitacao").hide();

	$("#mostar_solicitacoes").click(function(){
		$("#solicitacao_coisa_cadastra").toggle();
		$("#solicitacao_delete").hide();
		$("#tabela_tudo").hide();
		$("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  $("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
	})

	$("#solicitacao").click(function(){
		$("#pesquisa_solicitacao").toggle();
		$("#pesquisa_categoria").hide();
		$("#solicitacao_delete").hide();
		$("#tabela_tudo").show();
		$("#pesquisa_pedido").hide();
		$("#pesquisa_modelo").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();

		$("#pesquisa_pedido").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  $("#produtos_cadastra").hide();
    $("#materias_cadastra").hide();
    $("#produtos_delete").hide();
    $("#materiais_delete").hide();
	$("#pesquisa_categoria").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_materiais").hide();
	})

	$("#remove_solicitacao").click(function(){
		$("#solicitacao_delete").toggle();
		$("#pesquisa_solicitacao").hide();
		$("#solicitacao_coisa_cadastra").hide();
		$("#tabela_tudo").hide();
		$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#pesquisa_fornecedor").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#pedidos_cadastro").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
	})



















	

  /* Estoque js*/
  $("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  

  $("#mostrar_produto").click(function () {
    $("#produtos_cadastra").toggle();
    $("#tabela_tudo").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  $("#solicitacao_coisa_cadastra").hide();
    $("#solicitacao_delete").hide();
  })

  $("#mostar_materiais").click(function () {
    $("#materias_cadastra").toggle();
    $("#tabela_tudo").hide();
    $("#produtos_cadastra").hide();
  $("#produtos_delete").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  $("#solicitacao_coisa_cadastra").hide();
    $("#solicitacao_delete").hide();
  })

  $("#remover_calcado").click(function () {
    $("#produtos_delete").toggle()
    $("#tabela_tudo").hide();
    $("#solicitacao_coisa_cadastra").hide();
    $("#solicitacao_delete").hide();
    $("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#materiais_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  })


  $("#remove_material").click(function () {
    $("#materiais_delete").toggle();
    $("#solicitacao_coisa_cadastra").hide();
    $("#solicitacao_delete").hide();
    $("#produtos_cadastra").hide();
  $("#materias_cadastra").hide();
  $("#produtos_delete").hide();
  $("#pesquisa_modelo").hide();
  $("#pesquisa_categoria").hide();
  $("#pesquisa_materiais").hide();
  })

  $("#pesquisa_tudo").click(function () {
  	 $("#produtos_cadastra").hide();
    $("#materias_cadastra").hide();
    $("#produtos_delete").hide();
    $("#materiais_delete").hide();
    $("#tabela_tudo").show();
	$("#pesquisa_modelo").hide();
	$("#pesquisa_categoria").hide();
	$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_solicitacao").hide();
	$("#pesquisa_materiais").hide();
  })

  $("#pesquisa_calcado").click(function () {
    $("#tabela_tudo").show();

  })

  $("#pesquisa_material").click(function () {
    $("#pesquisa_materiais").toggle();
    $("#tabela_tudo").show();
   
  })

  $("#Fechar").click(function () {
    $("#produtos_cadastra").hide();
    $("#materias_cadastra").hide();
    $("#produtos_delete").hide();
    $("#materiais_delete").hide();
    $("#tabela_tudo").show();
	$("#pesquisa_modelo").hide();
	$("#pesquisa_categoria").hide();
	$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_solicitacao").hide();
	$("#pesquisa_materiais").hide();
  })
  
  $("#por_modelo").click(function (){
	$("#pesquisa_modelo").toggle();
	$("#produtos_cadastra").hide();
    $("#materias_cadastra").hide();
    $("#produtos_delete").hide();
    $("#materiais_delete").hide();
    $("#tabela_tudo").show();
	$("#pesquisa_categoria").hide();
	$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_solicitacao").hide();
	$("#pesquisa_materiais").hide();
  })
  
   $("#por_categoria").click(function (){
	$("#pesquisa_categoria").toggle();
	$("#produtos_cadastra").hide();
    $("#materias_cadastra").hide();
    $("#produtos_delete").hide();
    $("#materiais_delete").hide();
    $("#tabela_tudo").show();
	$("#pesquisa_modelo").hide();
	$("#pesquisa_pedido").hide();
	$("#pesquisa_Cliente").hide();
	$("#cliente_cadastro").hide();
	$("#cliente_delete").hide();
	$("#pedido_delete").hide();
	$("#fornecedor_delete").hide();
	$("#fornecedores_cadastro").hide();
	$("#pesquisa_fornecedor").hide();
	$("#pedidos_cadastro").hide();
	$("#solicitacao_coisa_cadastra").hide();
	$("#solicitacao_delete").hide();
	$("#pesquisa_solicitacao").hide();
	$("#pesquisa_materiais").hide();
	
  })



});