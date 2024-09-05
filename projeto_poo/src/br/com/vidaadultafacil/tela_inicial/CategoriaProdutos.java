package br.com.vidaadultafacil.tela_inicial;


public class CategoriaProdutos {
		
	String categoria = "";
	String descricaoCat = "";
	public CategoriaProdutos catProd = new CategoriaProdutos();
	
	public String getCategoria() {
		return categoria;
	}

	public String getDescricaoCat() {
		return descricaoCat;
	}

	public CategoriaProdutos getCatProd(){
		return catProd;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDescricao(String descricao) {
		this.descricaoCat = descricaoCat;
	}

	public void setCatProd(CategoriaProdutos catProd) {
		this.catProd = catProd;
	}
}
