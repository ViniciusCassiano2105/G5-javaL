package br.com.vidaadultafacil.usuarios;

public class Cliente extends Usuario {

	// Chave primária
	private int id;
	
	private String cpf = "";

	public Cliente(String nome, String email, String senha, String telefone, String cpf) {
		super(nome, email, senha, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + telefone + '\'' +
				", cpf='" + cpf + '\'' +
                '}';
    }
}
