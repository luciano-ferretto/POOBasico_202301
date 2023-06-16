import java.util.List;

public abstract class FormaGeometrica {
    private String cor;
    private List<Double> medidas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Double> getMedidas() {
        return medidas;
    }

    public void setMedidas(List<Double> medidas) {
        this.medidas = medidas;
    }

    @Override
    public String toString() {
        String medidasStr = "(";
        for (Double medida : medidas) {
            medidasStr = medidasStr + String.format("%.2f", medida) + ";";
        }
        medidasStr += ")";
        return this.getClass().getName() + ": " + this.getCor() + " - " + medidasStr;
    }

    public FormaGeometrica(String cor, List<Double> medidas) throws Exception {
        if (medidas.size() != getNMedida())
            throw new Exception("Número de medidas inválido para esta forma");
        this.cor = cor;
        this.medidas = medidas;
    }

    public abstract Double calculaArea();

    public abstract int getNMedida();
}
