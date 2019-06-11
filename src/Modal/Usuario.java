package Modal;

public class Usuario{
	private String nome;
	private String senha;
	private String id;
	private String perfil;
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
