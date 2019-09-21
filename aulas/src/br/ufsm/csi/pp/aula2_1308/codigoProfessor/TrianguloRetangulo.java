package br.ufsm.csi.pp.aula2_1308.codigoProfessor;

public class TrianguloRetangulo implements FormaGeometrica {

    private Double catetoOposto;
    private Double catetoAdjacente;

    public TrianguloRetangulo(Double catetoOposto, Double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;
    }

    public Double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(Double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public Double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(Double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    @Override
    public Double getArea() {
        return catetoAdjacente * catetoOposto / 2.0;
    }
}
