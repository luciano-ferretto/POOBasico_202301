package entities;

public class Produto {
    private int id;
    private String nome;
    private double valorUnitario;
    
    public Produto(int id, String nome, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return this.getId() + " - " + this.getNome() + " - R$ " + this.getValorUnitario();
            
    }
    
    
}
