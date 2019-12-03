package br.ufsm.csi.pp.aula10_0810.composite;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements ObjetoEntregavel {

    private Double precoCaixa;
    private List<ObjetoEntregavel> objetosContidos = new ArrayList<>();

    public Caixa(Double precoCaixa) {
        this.precoCaixa = precoCaixa;
    }

    @Override
    public Double getPreco() {
        Double total = this.precoCaixa; // preço já contido no objeto caixa, passado na hora de instância-lo
        for (ObjetoEntregavel objetos : objetosContidos) {
            total += objetos.getPreco();
        }
        return total;
    }

    public void adicionaObjeto(ObjetoEntregavel objetoEntregavel) {
        this.objetosContidos.add(objetoEntregavel);
    }

}
