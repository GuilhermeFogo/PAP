package Modal;

public class Material {
	private String quantidade;
	private String nome;
	private String descricao;
	private String medida;
	private String unidade;
	//private Fornecedor fornecedor;
	private String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getUnidade() {
		return unidade;
	}
	
	public String getMedida() {
		return medida;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public String getNome() {
		return nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}
