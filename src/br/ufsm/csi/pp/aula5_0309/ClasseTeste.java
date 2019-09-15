package br.ufsm.csi.pp.aula5_0309;

import java.util.Date;

public class ClasseTeste {

    private Long id;
    private String nome;
    private Date data;
    private String endereco;
    private Double comprimento;
    private Integer[] ids;

    @JSON
    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    @JSON
    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    @JSON
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JSON
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @JSON
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    @JSON
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
