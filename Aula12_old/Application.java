
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.Venda;
import entities.VendaProduto;
import services.ProdutoService;
import views.VendaView;

public class Application {

    

    public static void main(String[] args) {
        int i = 10;
       do {
            System.out.println("entrou loop 1");
            do {
                System.out.println("loop 2: " + i);
                i--;
                switch (i) {
                    case 10:
                        System.out.println(i);
                        break;
                    case 9:
                        System.out.println("99");
                        
                        break;
                    default:
                        break;
                }
            } while(true);
       } while (i != 0);
        
    }
}