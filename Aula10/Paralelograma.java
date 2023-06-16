import java.util.List;

public class Paralelograma extends FormaGeometrica{

    public Paralelograma(String cor, List<Double> medidas) throws Exception {
        super(cor, medidas);
    }

    @Override
    public Double calculaArea() {
        return getMedidas().get(0) * getMedidas().get(1);
    }

    @Override
    public int getNMedida() {
        return 2;
    }
    
}
