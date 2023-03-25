import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite a nota G1: ");
        Double notaG1 = lerTeclado.nextDouble();
        System.out.print("Digite a nota G2: ");
        Double notaG2 = lerTeclado.nextDouble();
        Double media = (notaG1 + notaG2) / 2;

        if (media >= 7)
            System.out.println("Parabéns!!! Você foi APROVADO");
        else if (media >= 3)
            System.out.println("Você deve realizar o Exame Final.");
        else
            System.out.println("Infelizmente Você foi REPROVADO.");

    }
}