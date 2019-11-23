package br.ufsm.csi.pp.aula3_4_2008_2708;

import java.util.Date;

public class Movimentacao {

    private String descricao;
    private Double valor;
    private TipoMovimentacao tipoMovimentacao;
    private Date data;

    public Movimentacao(String descricao, Double valor, TipoMovimentacao tipoMovimentacao, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipoMovimentacao = tipoMovimentacao;
        this.data = data;
    }

    public enum TipoMovimentacao {
        SAQUE,
        DEPOSITO
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
