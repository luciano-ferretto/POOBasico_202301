import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        String menu = """
                1 - Cadastro
                2 - Pesquisa
                0 - Sair
                """;
        Scanner lerTeclado = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(menu);
            opcao = lerTeclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Usuário selecionou CADASTRO");
                    break;
                case 2:
                    System.out.println("Usuário selecionou PESQUISA");
                    break;
                case 0:
                    System.out.println("Até breve!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (opcao != 0);
    }
}
