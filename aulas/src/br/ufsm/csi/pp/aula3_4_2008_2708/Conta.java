package br.ufsm.csi.pp.aula3_4_2008_2708;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Conta implements Cloneable {

    private Long id;
    private String nomePessoa;
    private String cpf;
    private Double saldo;
    private boolean especial;
    private Double limite;
    private List<Movimentacao> movimentacoes;
    private Banco banco;
    private TipoConta tipoConta;

    public Conta(Long id, String nomePessoa, boolean especial, Double limite, String cpf, TipoConta tipoConta) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.saldo = 0.0;
        this.especial = especial;
        this.limite = limite;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.movimentacoes = new ArrayList<>();
    }

    public Conta() {

    }

    public Conta clone() {
        try {
            return (Conta) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Cloning not allowed. ");
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
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

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.add(movimentacao);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return id.equals(conta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
