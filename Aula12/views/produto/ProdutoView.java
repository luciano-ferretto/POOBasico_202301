package views.produto;

import java.util.List;
import java.util.Scanner;

import entities.Produto;
import services.ProdutoService;

public class ProdutoView {
    private static ProdutoService produtoService = new ProdutoService();

    public static void imprimeListaProdutos() {
        System.out.print("\033[H\033[2J"); // Código para limpar o terminal
        System.out.println("==== Produtos Disponíveis ====");
        List<Produto> lista = produtoService.findAll();
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }
}
