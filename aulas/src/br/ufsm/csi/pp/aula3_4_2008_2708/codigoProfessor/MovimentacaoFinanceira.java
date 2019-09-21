package br.ufsm.csi.pp.aula3_4_2008_2708.codigoProfessor;

import java.util.Date;

public class MovimentacaoFinanceira implements Comparable {

    private Date data;
    private TipoMovimentacao tipoMovimentacao;
    private Double valor;

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public enum TipoMovimentacao { SAQUE, DEPOSITO }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int compareTo(Object o) {
        return this.data.compareTo(((MovimentacaoFinanceira) o).getData());
    }
}
