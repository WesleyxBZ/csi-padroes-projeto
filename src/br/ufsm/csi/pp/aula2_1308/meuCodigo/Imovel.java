package br.ufsm.csi.pp.aula2_1308.meuCodigo;

public class Imovel {

    private Peca[] pecas;
    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoImovel tipoImovel;

    public Imovel(Peca[] pecas, String identificacao, String proprietario, String endereco, TipoImovel tipoImovel) {
        this.pecas = pecas;
        this.identificacao = identificacao;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
    }

    public Peca[] getPecas() {
        return pecas;
    }

    public void setPecas(Peca[] pecas) {
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

    public enum TipoImovel {COMERCIAL, RESIDENCIAL}

}
