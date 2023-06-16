package entities;

import java.text.Format;

public class VendaProduto {
    private Produto produto;
    private double quantidade;
    
    public VendaProduto(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
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
    @Override
    public String toString() {
        return "Produto=" + produto + "quantidade=" + quantidade;
    }


    
}
