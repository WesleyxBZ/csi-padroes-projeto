package br.ufsm.csi.pp.aula03_04;

import java.util.Map;

public class View {

    public static void main(String[] args) {

        Long prox = 0L;
        Banco banco = new Banco();
        Long timecreate = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            //prox++;
            banco.criarConta("Pessoa" + i, true, 1000.0, "cpf" + i, i / 2 == 0 ?
                    Conta.TipoConta.CONTA_CORRENTE : Conta.TipoConta.POUPANCA);
            //banco.registrarDeposito(prox, i + 10.0);
        }

        System.out.println("Tempo de criação: " + (System.currentTimeMillis() - timecreate) + "ms");
        Long timeFind = System.currentTimeMillis();

        for (Map.Entry<Long, Conta> entry : banco.getMapContas().entrySet()) {
            /*System.out.println(
                    "Nome: " + entry.getValue().getNomePessoa() + " - " +
                            "Saldo: " + entry.getValue().getSaldo() + " - " +
                            "Tipo de conta: " + entry.getValue().getTipoConta().name());*/
        }

        System.out.println("Tempo ao percorrer todas as contas: " + (System.currentTimeMillis() - timeFind) + "ms");


        /* Extrato -> MOVIMENTAÇÃO

        banco.getMapContas().get(2l).setMovimentacao(new Movimentacao("A", 10.0,
                Movimentacao.TipoMovimentacao.DEPOSITO, new Date("2019/08/25")));
        System.out.println(banco.getExtrato(2L, new Date("2019/08/25"), new Date()));
        */

    }

}
