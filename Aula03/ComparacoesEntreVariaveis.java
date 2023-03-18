import java.util.Objects;
import java.util.Scanner;

public class ComparacoesEntreVariaveis {
    public static void main(String[] args) {
        int numero; //Declaração da variável do tipo Int com nome "numero"
        numero = 10; //Atribuindo o valor 10 na variável numero
        int segundoNumero = 10; //Declaração e atribuição de um segundo número 

        Scanner scan; //Declaração da variável do tipo Scanner com nome "scan"
        scan = new Scanner(System.in); // Atribuição- new= Nova Instância da classe Scanner

        String texto; // Declaração de uma variáve do tipo String com o nome "texto"
        texto = "Atitus"; // Atribuição do valor
        String segundoTexto = new String("Atitus"); 
                //Na linha acima temos um exemplo de declaração com atribuição criando um novo Objeto tipo String

        System.out.println("Números: " + (numero == segundoNumero)); //Nessa comparação teremos o retorno TRUE
        System.out.println("Texto: " + (texto.equals(segundoTexto))); //Nessa compração o retorno será FALSO, pois serão dois objetos DIFERENTES

    }
}
