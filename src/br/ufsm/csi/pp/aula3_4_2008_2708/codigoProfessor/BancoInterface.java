package br.ufsm.csi.pp.aula3_4_2008_2708.codigoProfessor;

import java.util.Date;

public interface BancoInterface {

    Conta criaConta(String nomePessoa,
                    String cpf,
                    Double saldoInicial,
                    Conta.TipoConta tipo);

    Conta excluiConta(Long idConta);

    boolean registraSaque(Long idConta, Double valor);

    void registraDeposito(Long idConta, Double valor);

    Double getSaldo(Long idConta);

    String getExtrato(Long idConta, Date dataInicial, Date dataFinal);

    boolean transferencia(Long idContaOrigem, Long idContaDestino, Double valor);

}
