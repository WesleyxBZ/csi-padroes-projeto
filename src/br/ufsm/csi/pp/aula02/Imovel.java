package br.ufsm.csi.pp.aula02;

import br.ufsm.csi.pp.aula02.formas.Forma3D;

import java.util.List;

public class Imovel implements Forma3D {

    private List<Peca> pecas;
    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoImovel tipoImovel;

    public Imovel(List<Peca> pecas, String identificacao, String proprietario, String endereco, TipoImovel tipoImovel) {
        this.pecas = pecas;
        this.identificacao = identificacao;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public enum TipoImovel {
        COMERCIAL("Comercial"), RESIDENCIAL("Residencial");

        private String tipo;

        TipoImovel(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

    @Override
    public Double getVolume() {
        Double volume = 0.0;
        for (Peca peca : pecas) {
            volume += peca.getVolume();
        }
        return volume;
    }

}
