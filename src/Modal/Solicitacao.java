package Modal;

public class Solicitacao {
	private String nomeMaterial;
	private String quantidade;
	private String descricao;
	private String data;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}
	
	public String getNomeMaterial() {
		return nomeMaterial;
	}
	public String getData() {
		return data;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
