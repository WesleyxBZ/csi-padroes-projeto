package br.ufsm.csi.pp.aula2_1308.formas;

public class Losango implements Forma2D {

    private Double x; // base
    private Double y; // altura

    public Losango(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public Double getArea() {
        return (x * y) / 2;
    }

}
