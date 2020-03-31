package br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model;

public class Prato {

    private Long id;
    private String nome;
    private String descricao;
    private String ingredientes;
    private Restaurante resturante;

    public Prato(Long id, String nome, String descricao, String ingredientes, Restaurante resturante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.resturante = resturante;
    }

    public Prato() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Restaurante getResturante() {
        return resturante;
    }

    public void setResturante(Restaurante resturante) {
        this.resturante = resturante;
    }

}
