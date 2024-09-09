package br.com.vidaadultafacil.tela_inicial;


public class CategoriaProdutos {
		
	// Chave primária
	private int id_Categoria;
	
	String categoria = "";
	String descricaoCat = "";
	public CategoriaProdutos catProd = new CategoriaProdutos();

	public CategoriaProdutos() {
	}

	public CategoriaProdutos(int id_Categoria, String categoria, String descricaoCat) {
		this.id_Categoria = id_Categoria;
		this.categoria = categoria;
		this.descricaoCat = descricaoCat;
	}
	
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

	public void setDescricao(String descricaoCat) {
		this.descricaoCat = descricaoCat;
	}

	public void setCatProd(CategoriaProdutos catProd) {
		this.catProd = catProd;
	}

	public int getIdCategoria() {
		return id_Categoria;
	}

	public void setIdCategoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}
	
}
