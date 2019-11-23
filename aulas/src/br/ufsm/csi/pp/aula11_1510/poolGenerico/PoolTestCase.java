package br.ufsm.csi.pp.aula11_1510.poolGenerico;

import br.ufsm.csi.pp.aula3_4_2008_2708.Banco;

public class PoolTestCase {

    public static void main(String[] args) {

    }

    private void test1() throws InstantiationException, IllegalAccessException {
        Pool<Banco> pool = new PoolGenerico<>(Banco.class);
    }

}
