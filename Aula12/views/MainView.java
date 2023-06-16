package views;

import java.util.Scanner;

import views.produto.ProdutoView;
import views.venda.VendaMainView;

public class MainView {
    public static void imprimeTelaInicial() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); // Código para limpar o terminal
            System.out.println("Seja Bem Vindo!!!");
            System.out.println("O que você deseja hoje?");
            System.out.println("1 - Visualizar Produtos");
            System.out.println("2 - Realizar Compra");
            System.out.println("0 - Sair");
            System.out.print("\nInforme sua opção > ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ProdutoView.imprimeListaProdutos();
                    System.out.println("--------------------------");
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 2:
                    VendaMainView.imprimeTelaVendaIncial();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }
}
