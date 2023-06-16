package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoService {
    public static List<Produto> produtos = new ArrayList<>(
        List.of(
            new Produto(1, "Monitor", 1250.90),
            new Produto(2, "PC", 3450.00),
            new Produto(3, "Notebook", 5460.79)
        )
    );
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    
}
