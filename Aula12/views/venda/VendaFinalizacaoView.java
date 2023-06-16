package views.venda;

import entities.Venda;

public class VendaFinalizacaoView {
    public static void imprimeTelaFinalizacao(Venda venda) {
        System.out.print("\033[H\033[2J"); // Código para limpar o terminal
        System.out.println("RESUMO DA COMPRA");
        System.out.println("CLIENTE: " + venda.getNomeCliente());
        System.out.println("Data/Hora: " + venda.getDataHora());
        System.out.println("------------------------------------------------");
        VendaItensView.imprimeItens(venda);
    }
}
