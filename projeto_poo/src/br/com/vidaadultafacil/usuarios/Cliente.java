package br.com.vidaadultafacil.usuarios;

public class Cliente extends Usuario {

	// Chave primária
	private int fk_id_usuario;
	
	private String cpf = "";

	public Cliente(int fk_id_usuario, String nome, String email, String senha, String telefone, String cpf) {
		super(fk_id_usuario, nome, email, senha, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getFk_id_usuario() {
		return fk_id_usuario;
	}

	public void setFk_id_usuario(int fk_id_usuario) {
		this.fk_id_usuario = fk_id_usuario;
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
