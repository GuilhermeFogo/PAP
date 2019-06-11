package Modal;

public class Calcados extends Produtos {
	private String numero;
	private String id;
	private String estilo;
	private String genero;
	private String cor;
	private String quantidade;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	
	public String getEstilo() {
		return estilo;
	}
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
