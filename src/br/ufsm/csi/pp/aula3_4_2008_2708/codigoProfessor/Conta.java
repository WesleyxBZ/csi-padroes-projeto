package br.ufsm.csi.pp.aula3_4_2008_2708.codigoProfessor;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Conta implements Cloneable {

    private TipoConta tipoConta;
    private Long codigoConta;
    private String nomeCliente;
    private String cpf;
    private Double limite;
    private Double saldo;
    private boolean especial;
    private Set<MovimentacaoFinanceira> movimentacoes = new TreeSet<MovimentacaoFinanceira>();

    public Conta clone() throws CloneNotSupportedException {
        return (Conta) super.clone();
    }

    public Conta(TipoConta tipoConta,
                 Long codigoConta,
                 String nomeCliente,
                 String cpf,
                 Double limite,
                 boolean especial) {
        this.tipoConta = tipoConta;
        this.codigoConta = codigoConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.limite = limite;
        this.especial = especial;
        this.saldo = 0.0;
    }

    public Long getCodigoConta() {
        return codigoConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return Objects.equals(codigoConta, conta.codigoConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConta);
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Set<MovimentacaoFinanceira> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(Set<MovimentacaoFinanceira> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public enum TipoConta {

        CONTA_CORRENTE(0.0),
        POUPANCA(0.0),
        RENDA_FIXA(0.275),
        RENDA_VARIAVEL(0.275);

        private final Double aliquotaIR;

        TipoConta(Double aliquotaIR) {
            this.aliquotaIR = aliquotaIR;
        }

        Double getImpostoDevido(Double rendimento) {
            return aliquotaIR * rendimento;
        }


    }

}
