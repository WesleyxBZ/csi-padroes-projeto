package br.ufsm.csi.pp.aula02.formas;

public class Quadrado implements Forma2D {

    private Double x; // lado

    public Quadrado(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    @Override
    public Double getArea() {
        return x * x;
    }

}
