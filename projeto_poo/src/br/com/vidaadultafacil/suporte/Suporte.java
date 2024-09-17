package br.com.vidaadultafacil.suporte;
import java.util.HashMap;
import java.util.Map;


public class Suporte {

	private int id;		
	private int fkCliente;	
	private String mensagem;
	private static final Map<Integer, Suporte> mapaSuporte = new HashMap();
	
	public Suporte(int id, int fkCliente, String mensagem) {
		this.id = id;
		this.fkCliente = fkCliente;
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public int getFkCliente() {
		return fkCliente;
	}
	
	public static Map <Integer, Suporte> getMapSuporte() {
    	return mapaSuporte;
	}

	public void setMensagem(String mensagem) {
		if (mensagem != null && !mensagem.trim().isEmpty()) {
			this.mensagem = mensagem;
		} else {
			System.out.println("Mensagem não pode ser vazia ou nula.");
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
		return "Suporte [id=" + id + ", Cliente=" + fkCliente + ", mensagem=" + mensagem + "]";
	}
	
}
