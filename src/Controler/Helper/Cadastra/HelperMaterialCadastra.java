package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

import Modal.Material;

public class HelperMaterialCadastra {
	private String nome;
	private String quantidade;
	private String descricao;
	private String unidade;
	private String medida;
	//private String cod_fornecedor;
	
	public HelperMaterialCadastra(HttpServletRequest request) {
		this.nome = request.getParameter("campo_material_nome");
		this.quantidade = request.getParameter("campo_material_quantidade");
		this.descricao = request.getParameter("campo_material_descricao");
		//this.cod = request.getParameter("campo_material_cod");
		//this.cod_fornecedor = request.getParameter("campo_material_fornecedor");
		this.unidade = request.getParameter("campo_material_unidade");
		this.medida = request.getParameter("campo_material_medida");
		
	}
	
	public String getMedida() {
		return medida;
	}
	public String getUnidade() {
		return unidade;
	}
//	public String getCod_fornecedor() {
//		return cod_fornecedor;
//	}
	public String getDescricao() {
		return descricao;
	}
	public String getNome() {
		return nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	
}
