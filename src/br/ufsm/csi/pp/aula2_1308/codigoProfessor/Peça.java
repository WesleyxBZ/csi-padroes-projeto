package br.ufsm.csi.pp.aula2_1308.codigoProfessor;

public class Peça implements Forma3D {

    private FormaGeometrica[] formasGeometricas;
    private Double peDireito;
    private String identificacao;

    public Peça(FormaGeometrica[] formasGeometricas, Double peDireito, String identificacao) {
        this.formasGeometricas = formasGeometricas;
        this.peDireito = peDireito;
        this.identificacao = identificacao;
    }

    public FormaGeometrica[] getFormasGeometricas() {
        return formasGeometricas;
    }

    public void setFormasGeometricas(FormaGeometrica[] formasGeometricas) {
        this.formasGeometricas = formasGeometricas;
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
        for (FormaGeometrica forma : formasGeometricas) {
            volume +=  forma.getArea() * peDireito;
        }
        return volume;
    }
}
