package br.ufsm.csi.pp.model;

import br.ufsm.csi.pp.annotations.ChavePrimaria;
import br.ufsm.csi.pp.annotations.Coluna;
import br.ufsm.csi.pp.annotations.Tabela;

@Tabela(nome = "PESSOA")
public class Pessoa {

    private Long id;
    private String nome;
    private String endereco;
    private int idade;

    @ChavePrimaria
    @Coluna(nome = "ID", tipo = "bigint")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Coluna(nome = "NOME", tipo = "varchar", size = 50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Coluna(nome = "SOBRENOME", tipo = "varchar", size = 50)
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Coluna(nome = "IDADE", tipo = "int", size = 10)
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}





