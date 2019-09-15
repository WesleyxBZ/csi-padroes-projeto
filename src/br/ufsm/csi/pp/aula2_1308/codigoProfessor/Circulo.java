package br.ufsm.csi.pp.aula2_1308.codigoProfessor;

public class Circulo implements FormaGeometrica {

    private Double raio;
    private Double anguloGraus;

    public Circulo(Double raio) {
        this.raio = raio;
        this.anguloGraus = 360.0;
    }

    public Circulo(Double raio, Double anguloGraus) {
        this.raio = raio;
        this.anguloGraus = anguloGraus;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getAnguloGraus() {
        return anguloGraus;
    }

    public void setAnguloGraus(Double anguloGraus) {
        this.anguloGraus = anguloGraus;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(raio, 2.0) * anguloGraus / 360.0;
    }
}
