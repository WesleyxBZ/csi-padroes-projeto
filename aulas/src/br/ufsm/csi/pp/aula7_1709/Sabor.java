package br.ufsm.csi.pp.aula7_1709;

import java.util.ArrayList;
import java.util.List;

public class Sabor {

    private String nome;
    private List<Ingrediente> ingredientes;

    private Sabor(Builder builder) {
        this.nome = builder.nome;
        this.ingredientes = builder.ingrediente;
    }

    public enum Ingrediente {
        QUEIJO_CHEDDAR("Queijo cheddar"),
        QUEIJO_PROVOLONE("Queijo provolone"),
        QUEIJO_PARMESAO("Queijo parmessão"),
        BACON("Bacon"),
        TOMATE("Tomate"),
        FRANGO("Frango"),
        PIMENTA_VERMELHA("Pimenta vermelha"),
        OREGANO("Oregano");

        private String nome;

        Ingrediente(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static class Builder {

        private String nome;
        private List<Ingrediente> ingrediente = new ArrayList<>();

        public Builder() {
        }

        public Sabor build() {
            return new Sabor(this);
        }

        public Sabor.Builder ingrediente(Ingrediente ingrediente) {
            this.ingrediente.add(ingrediente);
            return this;
        }

        public Sabor.Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getNome() {
        return nome;
    }

}
