import java.util.List;

public class Retangulo extends FormaGeometrica{
    public Retangulo(String cor, List<Double> medidas) {
        super(cor, medidas);
    }
    //@Override
    public Double calculaArea() {
        return this.getMedidas().get(0) * this.getMedidas().get(1);
    }

    
    
}
