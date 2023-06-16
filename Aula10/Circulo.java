import java.util.List;

public class Circulo extends FormaGeometrica{
    public Circulo(String cor, List<Double> medidas) throws Exception {
        super(cor, medidas);
    }
    //@Override
    public Double calculaArea() {
        return Math.PI * Math.pow(this.getMedidas().get(0), 2);
    }
    @Override
    public int getNMedida() {
        return 1;
    }
}
