package br.com.vidaadultafacil.usuarios;

public class Administrador extends Usuario {
	// Chave primária
	private int id;
	boolean isAdmin;

	public Administrador(String nome, String email, String senha, String telefone, boolean isAdmin) {
		super(nome, email, senha, telefone);
		this.isAdmin = isAdmin;
	}

	public boolean getisAdmin() {
		return isAdmin;
	}

	public int getId() {
		return id;
	}

	public String toDbLine() {
		return String.format("Administrador;%s;%s\n", this.nome, this.email, this.senha, this.telefone, this.isAdmin);
	}

	public String toString() {
		return "Admin{" + "nome='" + getNome() + '\'' + ", email='" + getEmail() + '\'' + ", isAdmin=" + isAdmin + '}';
	}
}