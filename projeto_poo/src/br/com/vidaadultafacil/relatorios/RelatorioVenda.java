package br.com.vidaadultafacil.relatorios;

public class RelatorioVenda {
	// Chave primária
	private int id;

	public int getIdRelVenda() {
		return id;
	}

	public void setIdRelVenda(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RelatorioVenda [id=" + id + "]";
	}
	
}
