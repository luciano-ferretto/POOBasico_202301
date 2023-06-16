package views.venda;

import java.util.Scanner;

import entities.ItemVenda;
import entities.Venda;
import services.VendaService;

public class VendaMainView {

    private static VendaService vendaService = new VendaService();

    public static void imprimeTelaVendaIncial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); // Código para limpar o terminal
        System.out.println("Por favor, informe seu nome:");
        String nome = scanner.nextLine();
        Venda venda = new Venda(nome);
        int opcao = 0;
        do {
            System.out.print("\033[H\033[2J"); // Código para limpar o terminal
            System.out.println("CLIENTE: " + venda.getNomeCliente());
            System.out.println("Data/Hora: " + venda.getDataHora());
            System.out.println("------------------------------------------------");
            System.out.println("Escolha uma das opções");
            System.out.println("1 - Adicionar Produto ao Carrinho");
            System.out.println("2 - Visualizar Carrinho");
            System.out.println("3 - Remover produto do Carrinho");
            System.out.println("4 - Finalizar Compra");
            System.out.println("0 - Cancelar Compra");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    ItemVenda item = VendaItensView.imprimeTelaAdd();
                    venda.getItens().add(item);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J"); // Código para limpar o terminal
                    VendaItensView.imprimeItens(venda);
                    System.out.println("--------------------------");
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 3:
                    VendaItensView.imprimeTelaDel(venda);
                    System.out.println("--------------------------");
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 4:
                    VendaFinalizacaoView.imprimeTelaFinalizacao(venda);
                    System.out.println("--------------------------");
                    System.out.println("Deseja realmente finalizar a compra? [N]");
                    String resposta = scanner.nextLine();
                    if (resposta.equals("Y") || resposta.equals("y")) {
                        venda = vendaService.finalizar(venda);
                        if (venda != null) {
                            System.out.println("Venda finalizada com sucesso!");
                            opcao = 0;
                        } else
                            System.out.println("Não foi possível finalizar a venda!");
                        System.out.println("--------------------------");
                        System.out.println("Pressione Enter para continuar");
                        scanner.nextLine();
                    }

                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Opção Inválida!");
                        System.out.println("--------------------------");
                        System.out.println("Pressione Enter para continuar");
                        scanner.nextLine();
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
