package br.com.vidaadultafacil.suporte;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Suporte {

	// Usuário que enviou a mensagem de suporte
	Cliente usuario;

	// Mensagem enviada pelo usuário solicitando suporte
	String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setUsuario() {
		this.usuario = usuario;
	}

}