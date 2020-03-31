package br.ufsm.csi.pp.aula07;

public class Calzone {

    private Sabor sabor;

    public Calzone(Builder builder) {
        this.sabor = builder.sabor;
    }

    public static class Builder {

        private Sabor sabor;

        public Calzone build() {
            return new Calzone(this);
        }

        public Builder() {
        }

        public Calzone.Builder sabor(Sabor sabor) {
            this.sabor = sabor;
            return this;
        }
    }

    public Sabor getSabor() {
        return sabor;
    }
}
