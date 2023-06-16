package services;

import entities.ItemVenda;
import entities.Venda;

public class VendaService {
    private boolean validarFinalizacaoVenda(Venda venda) {
        if (venda.getItens().isEmpty())
            return false;
        if (venda.getNomeCliente() == null || venda.getNomeCliente().isEmpty())
            return false;
        return true;
    }

    public Venda finalizar(Venda venda) {
        if (validarFinalizacaoVenda(venda))
            return venda;
        else
            return null;
    }

    public double calculaValorTotal(Venda venda) {
        double total = 0;
        for (ItemVenda item : venda.getItens()) {
            total += item.getProduto().getValorUnitario() * item.getQuantidade();
        }
        return total;
    }
}
