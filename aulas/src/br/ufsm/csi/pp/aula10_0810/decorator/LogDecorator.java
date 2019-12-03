package br.ufsm.csi.pp.aula10_0810.decorator;

import br.ufsm.csi.pp.aula3_4_2008_2708.BancoInterface;
import br.ufsm.csi.pp.aula3_4_2008_2708.Conta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class LogDecorator implements BancoInterface {

    private BancoInterface objetoEncapsulado;
    private Writer writer;

    public LogDecorator(File logFile, BancoInterface objetoEncapsulado) throws IOException {
        this.writer = new FileWriter(logFile);
        this.objetoEncapsulado = objetoEncapsulado;
    }

    @Override
    public Conta criarConta(String nomePessoa, Boolean especial, Double limite, String cpf, Conta.TipoConta tipo) {

        Long time = System.currentTimeMillis();
        Conta conta = objetoEncapsulado.criarConta(nomePessoa, false, limite, "cpf", tipo);
        time = System.currentTimeMillis() - time;
        try {
            writer.write("método invocado (" + time + "ms): criaConta(" + nomePessoa + ", "
                    + limite + ", " + tipo.name() + ", " + especial + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conta;
    }

    @Override
    public Conta excluiConta(Long idConta) {
        try {
            writer.write("método invocado: excluiConta(" + idConta + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objetoEncapsulado.excluiConta(idConta);
    }

    @Override
    public Boolean registrarSaque(Long idConta, Double valor) {
        return objetoEncapsulado.registrarSaque(idConta, valor);
    }

    @Override
    public Boolean registrarDeposito(Long idConta, Double valor) {
        return objetoEncapsulado.registrarDeposito(idConta, valor);
    }

    @Override
    public Boolean excluirConta(Long idConta) {
        return false;
    }

    @Override
    public Double getSaldo(Long idConta) {
        return objetoEncapsulado.getSaldo(idConta);
    }

    @Override
    public String getExtrato(Long idConta, Date dataInicial, Date dataFinal) {
        return objetoEncapsulado.getExtrato(idConta, dataInicial, dataFinal);
    }

    @Override
    public Boolean registrarTranferencia(Long idContaOrigem, Long idContaDestino, Double valor) {
        return false;
    }

}
