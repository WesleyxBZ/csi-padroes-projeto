package br.ufsm.csi.pp.aula03_04;

import java.util.Date;

public interface BancoInterface {

    Conta criarConta(String nomePessoa, Boolean especial, Double limite, String cpf, Conta.TipoConta Tipo);

    Conta excluiConta(Long idConta);

    Boolean excluirConta(Long idConta);

    Boolean registrarSaque(Long idConta, Double valor);

    Boolean registrarDeposito(Long idConta, Double saldo);

    Double getSaldo(Long idConta);

    String getExtrato(Long idConta, Date dataInicial, Date dataFinal);

    Boolean registrarTranferencia(Long idContaOrigem, Long idContaDestino, Double valor);

}

