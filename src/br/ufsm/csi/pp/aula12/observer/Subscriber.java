package br.ufsm.csi.pp.aula12.observer;

import br.ufsm.csi.pp.aula03_04.Conta;

public interface Subscriber {

    void update(Conta conta);

}
