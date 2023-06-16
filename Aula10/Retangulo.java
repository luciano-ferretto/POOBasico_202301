import java.util.List;

public class Retangulo extends FormaGeometrica{
    
    public Retangulo(String cor, List<Double> medidas) throws Exception {
        super(cor, medidas);
    }
    //@Override
    public Double calculaArea() {
        return this.getMedidas().get(0) * this.getMedidas().get(1);
    }

    public void metodoEspecificoRetangulo() {
        //executaria alguma função específica do retângulo
    }
    @Override
    public int getNMedida() {
        return 2;
    }
    
}
