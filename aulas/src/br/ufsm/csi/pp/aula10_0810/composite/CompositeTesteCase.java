package br.ufsm.csi.pp.aula10_0810.composite;

public class CompositeTesteCase {

    public static void main(String[] args) {

        new CompositeTesteCase().teste();

    }

    private void teste() {

        Produto produto1 = new Produto(100.0);
        Produto produto2 = new Produto(101.0);
        Produto produto3 = new Produto(102.0);
        Produto produto4 = new Produto(103.0);
        Produto produto5 = new Produto(104.0);

        Caixa caixa1 = new Caixa(10.0);
        Caixa caixa2 = new Caixa(20.0);

        caixa1.adicionaObjeto(produto1);
        caixa1.adicionaObjeto(produto2);
        caixa1.adicionaObjeto(caixa2);

        caixa2.adicionaObjeto(produto3);
        caixa2.adicionaObjeto(produto4);
        caixa2.adicionaObjeto(produto5);

        System.out.println("Preço total caixa 1: " + caixa1.getPreco());
        System.out.println("Preço total caixa 2: " + caixa2.getPreco());

    }

}
