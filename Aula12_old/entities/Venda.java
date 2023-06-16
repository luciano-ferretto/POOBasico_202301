package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {

    private String nomeCliente;
    private List<VendaProduto> itens;
    private LocalDateTime dataHoraVenda;
    
    public Venda(String nomeCliente, List<VendaProduto> itens) {
        this.nomeCliente = nomeCliente;
        this.itens = itens;
        this.dataHoraVenda = LocalDateTime.now();
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public List<VendaProduto> getItens() {
        return itens;
    }
    public void setItens(List<VendaProduto> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Venda \nnomeCliente=" + nomeCliente + "\nItens=" + itens;
    }


    public double calculaValorTotal() {
        double total = 0;
        for (VendaProduto item : this.itens) {
            total += item.getQuantidade() * item.getProduto().getValorUnitario();
        }
        return total;
    }
    
}
