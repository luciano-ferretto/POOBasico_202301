import java.util.Scanner;

class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite sua idade");
        idade = scan.nextInt();

        scan.close();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        

    }
}
