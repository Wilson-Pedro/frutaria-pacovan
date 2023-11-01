package model.bean;

public class Administrador extends Usuario{
	private static final long serialVersionUID = 1L;
	
    private String senha;

	public Administrador() {
		super();
	}

	public Administrador(int id, String nome, String sobrenome, String cpf, String telefone, String senha) {
		super(id, nome, sobrenome, cpf, telefone);
		this.senha = senha;
	}

	public Administrador(String nome, String senha) {
		setNome(nome);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
