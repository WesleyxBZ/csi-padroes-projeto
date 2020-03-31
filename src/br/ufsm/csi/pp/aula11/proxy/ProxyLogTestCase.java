package br.ufsm.csi.pp.aula11.proxy;

import br.ufsm.csi.pp.aula03_04.BancoInterface;
import br.ufsm.csi.pp.aula03_04.Conta;

import java.io.IOException;

public class ProxyLogTestCase {

    public static void main(String[] args) throws IOException {
        new ProxyLogTestCase().test1();
    }

    private void test1() throws IOException {
        BancoInterface banco = BancoFactory.createBanco();
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            banco.criarConta("Pessoa " + i, false, 0.0, "cpf" + i, Conta.TipoConta.CONTA_CORRENTE);
        }
        System.out.println("Tempo criação: " + (System.currentTimeMillis() - timeMillis) + "ms");
        timeMillis = System.currentTimeMillis();
        /*for (Map.Entry<Long, Conta> entry : banco.getMapContas().entrySet()) {
            banco.getSaldo(entry.getKey());
        }*/
        System.out.println("Tempo percorrimento: " + (System.currentTimeMillis() - timeMillis) + "ms");
    }
}
