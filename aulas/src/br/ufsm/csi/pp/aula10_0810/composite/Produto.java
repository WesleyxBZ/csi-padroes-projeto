package br.ufsm.csi.pp.aula10_0810.composite;

public class Produto implements ObjetoEntregavel {

    private Double preco;

    public Produto(Double preco) {
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
}
