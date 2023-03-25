import java.util.Random;

public class ExemploSwitch {
    public static void main(String[] args) {
        Random geradorAleatorio = new Random();
        int numeroGerado = geradorAleatorio.nextInt(2);
        switch (numeroGerado) {
            case 0:
                System.out.println("O número gerado é 0");
                break;
            case 1:
                System.out.println("o número gerado é 1");
                break;
            case 2:
                System.out.println("O número gerado é 2");
                break;
            default:
                System.out.println("O número gerado é maior que 2");
                break;
        }
    }
}
