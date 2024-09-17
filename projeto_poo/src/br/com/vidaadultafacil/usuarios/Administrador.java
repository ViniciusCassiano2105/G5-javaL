package br.com.vidaadultafacil.usuarios;
import java.util.HashMap;
import java.util.Map;

public class Administrador extends Usuario {
	// Chave primária
	private int id;
	boolean isAdmin;
	private static final Map<Integer, Administrador> admins = new HashMap<>();
	
	public Administrador() {
	}

	public Administrador(int id, String nome, String email, String senha, String telefone, boolean isAdmin) {
		super(nome, email, senha, telefone);
		this.id = id;
		this.isAdmin = isAdmin;
	}

	public Administrador(String nome, String email, String senha, String telefone, boolean isAdmin) {
		super(nome, email, senha, telefone);
		this.id = admins.size() + 1;
		this.isAdmin = isAdmin;
	}

	public boolean getisAdmin() {
		return isAdmin;
	}

	public int getId() {
		return id;
	}

	//Método autenticação
	public boolean autenticar(String nome, String senha) {
		for (Map.Entry<Integer, Administrador> adms : Administrador.getMapAdmin().entrySet()) {
			if (adms.getValue().getNome().equals(nome) && adms.getValue().getSenha().equals(senha)) {
				System.out.println("Acesso Permitido!");
				return true; 
			}
		}
		System.out.println("Acesso Negado!");
		return false;
	}

	public static Map<Integer, Administrador> getMapAdmin() {
        return admins;
    }

	public String toDbLine() {
		return String.format("Administrador;%s;%s\n", this.nome, this.email, this.senha, this.telefone, this.isAdmin);
	}

	public String toString() {
		return "Admin{" + "nome='" + getNome() + '\'' + ", email='" + getEmail() + '\'' + ", isAdmin=" + isAdmin + '}';
	}
}