package views;

import entities.Produto;
import services.ProdutoService;

public class VendaView {

    private ProdutoService produtoService = new ProdutoService();

    public void imprimeProdutos() {
        System.out.println("Produtos Cadastrados");
        for (Produto produto : produtoService.getProdutos()) {
            System.out.println(produto);
        }
    }


}
