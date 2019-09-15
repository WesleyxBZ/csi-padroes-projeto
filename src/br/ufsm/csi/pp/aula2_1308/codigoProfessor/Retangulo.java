package br.ufsm.csi.pp.aula2_1308.codigoProfessor;

public class Retangulo implements FormaGeometrica {

    private Double lado1;
    private Double lado2;

    public Retangulo(Double lado1, Double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(Double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    @Override
    public Double getArea() {
        return lado1 * lado2;
    }
}
