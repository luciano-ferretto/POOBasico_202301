import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Verde",List.of(3.0, 4.0));
        Quadrado quadrado = new Quadrado("Marrom", List.of(5.0));
        Circulo circulo = new Circulo("Amarelo", List.of(4.5));

        List<FormaGeometrica> lista = new ArrayList<>();
        lista.add(retangulo);
        lista.add(quadrado);
        lista.add(circulo);

        for (FormaGeometrica forma : lista) {
            System.out.println(forma.toString());
            System.out.println(" -- Área: " + forma.calculaArea());
        }
    }
}
