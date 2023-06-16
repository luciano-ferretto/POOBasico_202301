package entities;

public class ProdutoEstoque {
    private int id;
    private Produto produto;
    private double quantidade;
    public ProdutoEstoque(int id, Produto produto, double quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    
}
