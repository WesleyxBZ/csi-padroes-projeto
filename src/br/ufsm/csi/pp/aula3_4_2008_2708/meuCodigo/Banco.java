package br.ufsm.csi.pp.aula3_4_2008_2708.meuCodigo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Banco implements BancoInterface {

    private Map<Long, Conta> mapContas = new HashMap<>();
    private Long PROX_ID = 0l;

    private synchronized Long getProxCodConta() {
        return ++PROX_ID;
    }

    public boolean verificaConta(Conta conta) {
        return conta != null;
    }

    @Override
    public Conta criarConta(String nomePessoa, boolean especial, Double limite, Banco banco, Conta.TipoConta tipo) {
        Conta conta = new Conta(getProxCodConta(), nomePessoa, especial, limite, banco, tipo);
        mapContas.put(conta.getId(), conta);
        return conta.clone();
    }

    @Override
    public boolean excluirConta(Long idConta) {
        Conta conta = mapContas.get(idConta);
        if (verificaConta(conta)) {
            mapContas.remove(idConta);
            return true;
        } else {
            throw new IllegalArgumentException("Conta inexistente.");
        }
    }

    @Override
    public boolean registrarSaque(Long idConta, Double valor) {
        Conta conta = mapContas.get(idConta);
        if (verificaConta(conta) && conta.getSaldo() > valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            conta.setMovimentacao(new Movimentacao("Saque", valor, Movimentacao.TipoMovimentacao.SAQUE, new Date()));
            return true;
        } else if (valor <= 0.0) {
            throw new IllegalArgumentException("valor inválido para saque");
        } else {
            throw new IllegalArgumentException("Conta inexistente.");
        }
    }

    @Override
    public boolean registrarDeposito(Long idConta, Double valor) {
        Conta conta = mapContas.get(idConta);
        if (verificaConta(conta) && valor > 0.0) {
            conta.setSaldo(conta.getSaldo() + valor);
            conta.setMovimentacao(new Movimentacao("Depósito", valor, Movimentacao.TipoMovimentacao.DEPOSITO, new Date()));
            return true;
        } else if (valor <= 0.0) {
            throw new IllegalArgumentException("valor inválido para depósito");
        } else {
            throw new IllegalArgumentException("Conta inexistente.");
        }
    }

    @Override
    public Double getSaldo(Long idConta) {
        Conta conta = mapContas.get(idConta);
        if (verificaConta(conta)) {
            return conta.getSaldo();
        } else {
            throw new IllegalArgumentException("Conta inexistente.");
        }
    }

    @Override
    public String getExtrato(Long idConta, Date dataInicial, Date dataFinal) {

        Conta conta = mapContas.get(idConta);
        if (conta != null) {
            StringBuilder extrato = new StringBuilder();
            System.out.println("\n=== Extrato entre os dias " + dataInicial.getDate() + " e " + dataFinal.getDate() + " ===");
            for (int i = 0; i < conta.getMovimentacoes().size(); i++) {
                if (conta.getMovimentacoes().get(i).getData().after(dataInicial) && conta.getMovimentacoes().get(i).getData().before(dataFinal)) {
                    extrato.append("\n ○ " + conta.getMovimentacoes().get(i).getDescricao() + " - " +
                            conta.getMovimentacoes().get(i).getTipoMovimentacao() + " - R$" +
                            conta.getMovimentacoes().get(i).getValor() + "0\n");
                }
            }
            return extrato.toString();
        } else {
            throw new IllegalArgumentException("Conta inexistente.");
        }
    }

    @Override
    public boolean registrarTranferencia(Long idContaOrigem, Long idContaDestino, Double valor) {
        return false;
    }

    public Map<Long, Conta> getMapContas() {
        return mapContas;
    }

    public void setMapContas(Map<Long, Conta> mapContas) {
        this.mapContas = mapContas;
    }

    public Long getPROX_ID() {
        return PROX_ID;
    }

    public void setPROX_ID(Long PROX_ID) {
        this.PROX_ID = PROX_ID;
    }

}