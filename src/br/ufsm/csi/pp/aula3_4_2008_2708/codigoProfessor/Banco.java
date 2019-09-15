package br.ufsm.csi.pp.aula3_4_2008_2708.codigoProfessor;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Banco implements BancoInterface {

    private Long PROX_ID = 0l;
    private Map<Long, Conta> mapContas = new ConcurrentHashMap<Long, Conta>();
    public Map<Long, Conta> getMapContas() {
        return mapContas;
    }

    private synchronized Long getProxCodigoConta() {
        return ++PROX_ID;
    }

    @Override
    public Conta criaConta(String nomePessoa, String cpf, Double saldoInicial, Conta.TipoConta tipo) {
        Conta conta = new Conta(tipo, getProxCodigoConta(), nomePessoa, cpf, 0.0, false);
        conta.setSaldo(saldoInicial);
        mapContas.put(conta.getCodigoConta(), conta);
        Conta clone = null;
        try {
            clone = conta.clone();
        } catch (CloneNotSupportedException e) { }
        return clone;
    }

    @Override
    public Conta excluiConta(Long idConta) {
        return mapContas.remove(idConta);
    }

    @Override
    public boolean registraSaque(Long idConta, Double valor) {
        return false;
    }

    @Override
    public void registraDeposito(Long idConta, Double valor) {
        Conta conta = mapContas.get(idConta);
        if (conta != null && valor > 0.0) {
            MovimentacaoFinanceira movimentacaoFinanceira = new MovimentacaoFinanceira();
            movimentacaoFinanceira.setData(new Date());
            movimentacaoFinanceira.setTipoMovimentacao(MovimentacaoFinanceira.TipoMovimentacao.DEPOSITO);
            movimentacaoFinanceira.setValor(valor);
            conta.getMovimentacoes().add(movimentacaoFinanceira);
            conta.setSaldo(conta.getSaldo() + valor);
        } else if (valor <= 0.0) {
            throw new IllegalArgumentException("valor inválido para depósito");
        } else {
            throw new IllegalArgumentException("não existe nenhuma conta com o código " + idConta);
        }
    }

    @Override
    public Double getSaldo(Long idConta) {
        Conta conta = mapContas.get(idConta);
        if (conta != null) {
            return conta.getSaldo();
        } else {
            throw new IllegalArgumentException("não existe nenhuma conta com o código " + idConta);
        }
    }

    @Override
    public String getExtrato(Long idConta, Date dataInicial, Date dataFinal) {
        return null;
    }

    @Override
    public boolean transferencia(Long idContaOrigem, Long idContaDestino, Double valor) {
        return false;
    }
}
