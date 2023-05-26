import java.util.List;

public class Quadrado extends FormaGeometrica{
    public Quadrado(String cor, List<Double> medidas) {
        super(cor, medidas);
    }
    //@Override
    public Double calculaArea() {
        return Math.pow(this.getMedidas().get(0), 2.);
    }
}
