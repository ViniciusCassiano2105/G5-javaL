package br.com.vidaadultafacil.pedidos;

public class CarrinhoProduto {
    int id;
    int FkCarrinho;
    int FkProduto;

    public CarrinhoProduto(int id, int fkCarrinho, int fkProduto) {
        this.id = id;
        FkCarrinho = fkCarrinho;
        FkProduto = fkProduto;
    }

    public int getId() {
        return id;
    }

    public int getFKCarrinho() {
        return FkCarrinho;
    } 

    public int getFkProduto() {
        return FkProduto;
    }
}
