import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        /*
         * FormaGeometrica formaGenerica = null;
         * try {
         * formaGenerica = new Retangulo("Vermelho", List.of(3.0, 4.0));
         * } catch (Exception e) {
         * System.out.println(e.getMessage());
         * }
         * 
         * // formaGenerica.metodoEspecificoRetangulo(); Erro de compilação
         * Retangulo formaGenericaRet = (Retangulo) formaGenerica;
         * formaGenericaRet.metodoEspecificoRetangulo();
         * 
         * FormaGeometrica formaGenerica02 = new Quadrado("Azul", List.of(5.0));
         * if (formaGenerica02 instanceof Retangulo) {
         * Retangulo formaGenericaRet02 = (Retangulo) formaGenerica02;
         * formaGenericaRet02.metodoEspecificoRetangulo();
         * }
         */

        Retangulo retangulo = null;
        Quadrado quadrado = null;
        Circulo circulo = null;
        try {
            retangulo = new Retangulo("Verde", List.of(3.0, 4.5));
            quadrado = new Quadrado("Marrom", List.of(5.0));
            circulo = new Circulo("Amarelo", List.of(4.5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<FormaGeometrica> lista = new ArrayList<>();
        if (retangulo != null) lista.add(retangulo);
        if (quadrado != null) lista.add(quadrado);
        if (circulo != null) lista.add(circulo);

        for (FormaGeometrica forma : lista) {
            System.out.println(forma.toString());
            System.out.println(" -- Área: " + forma.calculaArea());
        }
    }
}
