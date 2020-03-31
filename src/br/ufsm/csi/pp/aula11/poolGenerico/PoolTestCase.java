package br.ufsm.csi.pp.aula11.poolGenerico;

import br.ufsm.csi.pp.aula03_04.Banco;

public class PoolTestCase {

    public static void main(String[] args) {

    }

    private void test1() throws InstantiationException, IllegalAccessException {
        Pool<Banco> pool = new PoolGenerico<>(Banco.class);
    }

}
