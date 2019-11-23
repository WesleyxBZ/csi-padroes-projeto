package br.ufsm.csi.pp.aula12_2910.observer;

import br.ufsm.csi.pp.aula3_4_2008_2708.Conta;

public interface Subscriber {

    void update(Conta conta);

}
