package br.com.vidaadultafacil.suporte;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Suporte {

	private int id;		
	private Cliente usuario;	
	private String mensagem;

	public Suporte(int id, Cliente usuario, String mensagem) {
		this.id = id;
		this.usuario = usuario;
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setMensagem(String mensagem) {
		if (mensagem != null && !mensagem.trim().isEmpty()) {
			this.mensagem = mensagem;
		} else {
			System.out.println("Mensagem não pode ser vazia ou nula.");
		}
	}

	public void setUsuario(Cliente usuario) {
		if (usuario != null) {
			this.usuario = usuario;
		} else {
			System.out.println("Usuário não pode ser nulo.");
		}
	}

	public int getIdSuporte() {
		return id;
	}

	public void setIdSuporte(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Suporte [id=" + id + ", usuario=" + usuario + ", mensagem=" + mensagem + "]";
	}
	
}
