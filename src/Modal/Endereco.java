package Modal;

public class Endereco {
	private String rua;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
}
