import java.util.Scanner;

public class ExemplosFor {

    public static void main(String[] args) {
        int numeros[] = {1,3,5,7,9};
        for (int num : numeros) {
            System.out.println(num);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        Scanner scan = new Scanner(System.in);
		System.out.println("Pressione S para parar.");
		for (int i = 0; scan.next().charAt(0) != 'S'; i++) {
			System.out.println("passou: "+ i +  " vezes");
       	}


        /*int i = 0;
		for (; i < 10;) {
			System.out.println("passou: "+ i + " vezes");
			i++;
       	}*/

        for (;;) {
			System.out.println("Loop infinito");
            break;
       	}

     /*

        for (double num = 100.0; num >=1; num-=5){
            System.out.printf("Raiz quadrada de %.0f é igual a %.3f\n", num, Math.sqrt(num));
        }



        int numeros[] = {1,3,5,7,9};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
*/
        
    }
}