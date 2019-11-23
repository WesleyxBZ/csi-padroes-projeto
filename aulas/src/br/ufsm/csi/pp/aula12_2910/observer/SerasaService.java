package br.ufsm.csi.pp.aula12_2910.observer;

import br.ufsm.csi.pp.aula3_4_2008_2708.Conta;

import java.util.ArrayList;
import java.util.List;

public class SerasaService implements Subscriber {

    private List<String> cpfsNegativados = new ArrayList<>();

    @Override
    public void update(Conta conta) {
        if (conta.getSaldo() < 0.0 && !cpfsNegativados.contains(conta.getCpf())) {
            cpfsNegativados.add(conta.getCpf());
        } else if (conta.getSaldo() >= 0.0 && cpfsNegativados.contains(conta.getCpf())) {
            cpfsNegativados.remove(conta.getCpf());
        }
    }

}
