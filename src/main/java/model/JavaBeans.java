
package model;

public class JavaBeans {
	//variaveis
	private String idcon;
	private String nome;
	private String fone;
	private String email;
	
	//construtor padrao
	public JavaBeans() {
		super();
	}
	//construturo com parametros
	public JavaBeans(String idcon, String nome, String fone, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	//variaveis encapsuladas nos metodos
	public String getIdcon() {
		return idcon;
	}
	
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
