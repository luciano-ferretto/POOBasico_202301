package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoService {
    private static List<Produto> listaProdutos = new ArrayList<>(
        List.of(
            new Produto(1, "Monitor", 1250.90),
            new Produto(2, "PC Desktop", 3580.00),
            new Produto(3, "Notebook", 5500.00)
        )
    );

    public List<Produto> findAll() {
        return listaProdutos;
    }
    public Produto findById(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id)
                return produto;
        }
        return null;
    }
}
