package br.ufsm.csi.pp.aula02;

import br.ufsm.csi.pp.aula02.formas.Forma2D;
import br.ufsm.csi.pp.aula02.formas.Forma3D;

import java.util.ArrayList;
import java.util.List;

public class Peca implements Forma3D {

    private List<Forma2D> formasGeometricas;
    private Double peDireito;
    private String identificacao;

    public Peca(Double peDireito, String identificacao) {
        this.peDireito = peDireito;
        this.identificacao = identificacao;
        this.formasGeometricas = new ArrayList<>();
    }

    public List<Forma2D> getFormasGeometricas() {
        return formasGeometricas;
    }

    public void setFormasGeometricas(List<Forma2D> formasGeometricas) {
        this.formasGeometricas = formasGeometricas;
    }

    public void addFormaGeometrica(Forma2D forma2D) {
        this.formasGeometricas.add(forma2D);
    }

    public Double getPeDireito() {
        return peDireito;
    }

    public void setPeDireito(Double peDireito) {
        this.peDireito = peDireito;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public Double getVolume() {
        Double volume = 0.0;
        for (Forma2D forma : formasGeometricas) {
            volume += forma.getArea() * peDireito;
        }
        return volume;
    }

}
