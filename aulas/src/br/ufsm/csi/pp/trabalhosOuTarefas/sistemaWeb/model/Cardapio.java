package br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private Long id;
    private List<Prato> pratos;
    private Restaurante resturante;
    private LocalDate data;

    private Cardapio(Builder builder) {
        this.id = builder.id;
        this.data = builder.data;
        this.pratos = builder.pratos;
        this.resturante = builder.resturante;
        this.data = builder.data;
    }

    public static class Builder {

        private Long id;
        private List<Prato> pratos = new ArrayList<>();
        private Restaurante resturante;
        private LocalDate data;

        public Builder(Long id, Restaurante restaurante, LocalDate data) {
            this.id = id;
            this.resturante = restaurante;
            this.data = data;
        }

        public Cardapio build() {
            return new Cardapio(this);
        }

        public Builder prato(Prato prato) {
            this.pratos.add(prato);
            return this;
        }

    }

    public Long getId() {
        return id;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public Restaurante getResturante() {
        return resturante;
    }

    public LocalDate getData() {
        return data;
    }

}
