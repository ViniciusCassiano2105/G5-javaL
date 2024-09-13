package br.com.vidaadultafacil.usuarios;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Usuario {

	// Chave primária
	private int id;
	private String cpf = "";
	boolean cpfValido = false;
	private static final Map<Integer, Cliente> clientes = new HashMap();

	public Cliente(int id, String nome, String email, String senha, String telefone, String cpf) {
		super(nome, email, senha, telefone);
		this.id = id;
		this.cpf = cpf;
	}

	public Cliente(String nome, String email, String senha, String telefone, String cpf) {
		super(nome, email, senha, telefone);
		this.id = clientes.size() + 1;
		this.cpf = cpf;
	}

	public void setCpf(String cpf) {
		while (!cpfValido) {            
            if (cpf != null) {
                String cpfNumeros = cpf.replaceAll("\\D", "");

                // Verificar se o CPF tem 11 dígitos
                if (cpfNumeros.length() == 11) {
                    this.cpf = cpfNumeros;
                    cpfValido = true;
                } else {
                    System.out.println("CPF deve conter exatamente 11 dígitos. Tente novamente.");
                }
            } else {
                System.out.println("CPF não pode ser nulo. Tente novamente.");
            }
        }
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

	public static Map<Integer, Cliente> getMapClientes() {
		return clientes;
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
