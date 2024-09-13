package br.com.vidaadultafacil.tela_inicial;


public class CategoriaProdutos {
		
	// Chave primária
	private int id;

	private int fkProduto;
	String categoria;
	String descricaoCat;
	public CategoriaProdutos catProd = new CategoriaProdutos();

	public CategoriaProdutos() {
	}

	public CategoriaProdutos(int id, String categoria, String descricaoCat) {
		this.id = id;
		this.categoria = categoria;
		this.descricaoCat = descricaoCat;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		if (categoria!=null && !categoria.trim().isEmpty()) {
			this.categoria = categoria;			
		} else {
			System.out.println("A categoria não pode ser vazia ou nulo.");
		}
	}

	public String getDescricaoCat() {
		return descricaoCat;
	}

	public void setDescricaoCat(String descricaoCat) {
		if(descricaoCat!=null && !descricaoCat.trim().isEmpty()){
			this.descricaoCat = descricaoCat;
		} else {
			System.out.println("A descrição não pode ser vazia ou nulo.");
		}
	}

	public CategoriaProdutos getCatProd(){
		return catProd;
	}

	public void setCatProd(CategoriaProdutos catProd) {
		this.catProd = catProd;
	}

	public int getIdCategoria() {
		return id;
	}

	public void setIdCategoria(int idCategoria) {
		this.id = idCategoria;
	}

	public int getFkProduto() {
		return fkProduto;
	}
	
	@Override
	public String toString() {
		return "CategoriaProdutos [idCategoria=" + id + ", categoria=" + categoria + ", descricaoCat="
				+ descricaoCat + ", catProd=" + catProd + "]";
	}
}