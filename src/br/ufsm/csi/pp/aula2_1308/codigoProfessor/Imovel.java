package br.ufsm.csi.pp.aula2_1308.codigoProfessor;

public class Imovel implements Forma3D {

    private Peça[] peças;
    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoImovel tipoImovel;

    public enum TipoImovel {

        COMERCIAL("Comercial"), RESIDENCIAL("Residencial");

        private final String nomeFantasia;

        TipoImovel(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
        }

        public String toString() {
            return nomeFantasia;
        }

    }

    public static class TipoImovelClasse {

        public static final TipoImovelClasse COMERCIAL = new TipoImovelClasse();
        public static final TipoImovelClasse RESIDENCIAL = new TipoImovelClasse();

        private TipoImovelClasse() { }

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

    public Peça[] getPeças() {
        return peças;
    }

    public void setPeças(Peça[] peças) {
        this.peças = peças;
    }

    @Override
    public Double getVolume() {
        Double volume = 0.0;
        for (Peça peça : peças) {
            volume += peça.getVolume();
        }
        return volume;
    }
}
