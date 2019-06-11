package Modal;

public class Fornecedor{
	private String contato;
	private String nome_Empresa;
	private String CNPJ;
	private String email;
	private String telefone;
	private String precofornecedor;
	private Endereco endereco;
	private String id;
	
	public Fornecedor() {
		this.endereco = new Endereco();
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public String getContato() {
		return contato;
	}
	public String getEmail() {
		return email;
	}
	public String getNome_Empresa() {
		return nome_Empresa;
	}
	public String getPrecofornecedor() {
		return precofornecedor;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome_Empresa(String nome_Empresa) {
		this.nome_Empresa = nome_Empresa;
	}
	public void setPrecofornecedor(String precofornecedor) {
		this.precofornecedor = precofornecedor;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
