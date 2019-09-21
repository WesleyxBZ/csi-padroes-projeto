package br.ufsm.csi.pp.aula3_4_2008_2708.meuCodigo;

import java.util.Date;

public interface BancoInterface {

    Conta criarConta(String nomePessoa, boolean especial, Double limite, Banco banco, Conta.TipoConta Tipo);

    boolean excluirConta(Long idConta);

    boolean registrarSaque(Long idConta, Double valor);

    boolean registrarDeposito(Long idConta, Double saldo);

    Double getSaldo(Long idConta);

    String getExtrato(Long idConta, Date dataInicial, Date dataFinal);

    boolean registrarTranferencia(Long idContaOrigem, Long idContaDestino, Double valor);

}

