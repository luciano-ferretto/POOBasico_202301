package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import entities.ProdutoEstoque;

public class ProdutoEstoqueService {

    public static List<ProdutoEstoque> estoque = new ArrayList<>();

    static {
        for (Produto produto: ProdutoService.produtos) {
            estoque.add(new ProdutoEstoque(1, produto, 10));
        }
    }
    
    public List<ProdutoEstoque> getEstoque() {
        return estoque;
    }
    public ProdutoEstoque getEstoque(int idProduto) {
        for (ProdutoEstoque produtoEstoque : estoque) {
            if (produtoEstoque.getProduto().getId() == idProduto)
                return produtoEstoque;
        }
        return new ProdutoEstoque(-1, null, 0);
    }
}
