package model.bean;

public class Administrador extends Usuario{
	private static final long serialVersionUID = 1L;
	
	private String email;
    private String senha;

	public Administrador() {
		super();
	}

	public Administrador(int id, String nome, String sobrenome) {
		super(id, nome, sobrenome);
	}

	public Administrador(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
