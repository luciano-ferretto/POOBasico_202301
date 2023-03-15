import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        double catetoA;
        double catetoB;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro cateto: ");
        catetoA = lerTeclado.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        catetoB = lerTeclado.nextDouble();
        lerTeclado.close();

        catetoA = Math.pow(catetoA, 2);
        catetoB = Math.pow(catetoB, 2);
        double hipotenusa = Math.sqrt(catetoA + catetoB);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}
