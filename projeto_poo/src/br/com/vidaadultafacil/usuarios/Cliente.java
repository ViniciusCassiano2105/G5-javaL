package br.com.vidaadultafacil.usuarios;

public class Cliente extends Usuario {

	// Chave primária
	private int id;
	private String cpf = "";

	public Cliente(String nome, String email, String senha, String telefone, String cpf) {
		super(nome, email, senha, telefone);
		this.cpf = cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setId() {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String toDbLine() {
		return String.format("Cliente;%s;%s;%s;%s;%s\n", this.nome, this.email, this.senha, this.telefone, this.cpf);
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
