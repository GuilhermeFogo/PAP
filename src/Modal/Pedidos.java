package Modal;

public class Pedidos {
	private String id;
	private String cnpj;
	private String produto;
	private String Quantidade;
	private String Formapg;
	private String preco;
	private String Data;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}
	public String getFormapg() {
		return Formapg;
	}
	public void setFormapg(String formapg) {
		Formapg = formapg;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
	
}
