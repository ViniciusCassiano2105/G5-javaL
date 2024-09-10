package br.com.vidaadultafacil.suporte;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Suporte {

	// Chave primária
	private int id;
	
	// Usuário que enviou a mensagem de suporte
	Cliente usuario;

	// Mensagem enviada pelo usuário solicitando suporte
	String mensagem;

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
		this.mensagem = mensagem;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
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