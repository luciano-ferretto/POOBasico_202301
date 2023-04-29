public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca.equals("Peugeot"))
            this.marca = "Nem a pau";
        else
            this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    Veiculo() {
        this("Sem marca definida");
    }
    Veiculo(String marca){
        this(marca, "Sem modelo definido");
    }
    Veiculo (String marca, String modelo) {
        this(marca, modelo, -1);
    }
    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    int calculaIdade() {
        return calculaIdade(2023);
    }

    int calculaIdade(int anoBase) {
        return anoBase - this.ano;
    }

}
