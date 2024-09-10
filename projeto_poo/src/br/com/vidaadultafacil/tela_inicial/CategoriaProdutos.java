package br.com.vidaadultafacil.tela_inicial;


public class CategoriaProdutos {
		
	// Chave primária
	private int idCategoria;
	
	String categoria = "";
	String descricaoCat = "";
	public CategoriaProdutos catProd = new CategoriaProdutos();

	public CategoriaProdutos() {
	}

	public CategoriaProdutos(int idCategoria, String categoria, String descricaoCat) {
		this.idCategoria = idCategoria;
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
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "CategoriaProdutos [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descricaoCat="
				+ descricaoCat + ", catProd=" + catProd + "]";
	}
	
}
