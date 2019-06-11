package Modal;

public abstract class Lojas {
	private String nome;
	private Endereco endereco;
	private String telefone;
	private String contato;
	
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Lojas() {
		this.endereco = new Endereco();
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
