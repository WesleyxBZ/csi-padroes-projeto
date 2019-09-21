package br.ufsm.csi.pp.aula7_1709;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Tamanho tamanho;
    private List<Sabor> sabores;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.sabores = builder.sabores;
    }

    public enum Tamanho {
        PEQUENA("Pequena"),
        MEDIA("Média"),
        GRANDE("Grande"),
        GIGANTE("Gigante");

        private String nome;

        Tamanho(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static class Builder {

        private Tamanho tamanho;
        private List<Sabor> sabores = new ArrayList<>();

        public Pizza build() {
            return new Pizza(this);
        }

        // Obriga a pizza a ter pelo menos um tamanho e sabor
        public Builder(Tamanho tamanho, Sabor sabor) {
            this.tamanho = tamanho;
            this.sabores.add(sabor);
        }

        public Builder() {
        }

        public Pizza.Builder tamanho(Tamanho tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public Pizza.Builder sabor(Sabor sabor) {
            this.sabores.add(sabor);
            return this;
        }

    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public List<Sabor> getSabores() {
        return sabores;
    }

}