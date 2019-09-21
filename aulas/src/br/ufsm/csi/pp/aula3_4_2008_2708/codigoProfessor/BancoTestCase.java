package br.ufsm.csi.pp.aula3_4_2008_2708.codigoProfessor;

import java.util.Map;

public class BancoTestCase {

    public static void main(String[] args) {
        Banco banco = new Banco();
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            banco.criaConta("Pessoa " + i, "cpf " + i, 0.0, Conta.TipoConta.CONTA_CORRENTE);
        }
        System.out.println("Tempo criação: " + (System.currentTimeMillis() - timeMillis) + "ms");
        timeMillis = System.currentTimeMillis();
        for (Map.Entry<Long, Conta> entry : banco.getMapContas().entrySet()) {
            banco.getSaldo(entry.getKey());
        }
        System.out.println("Tempo percorrimento: " + (System.currentTimeMillis() - timeMillis) + "ms");
    }

}
