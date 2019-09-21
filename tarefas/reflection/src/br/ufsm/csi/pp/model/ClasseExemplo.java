package br.ufsm.csi.pp.model;

import br.ufsm.csi.pp.annotations.ChavePrimaria;
import br.ufsm.csi.pp.annotations.Coluna;
import br.ufsm.csi.pp.annotations.Tabela;

/**
 * Created by politecnico on 09/10/2017.
 */
@Tabela(nome = "CLASSE_EXEMPLO")
public class ClasseExemplo {

    private Long id;
    private Long codigo;
    private String atributo1;
    private String atributo2;

    @ChavePrimaria
    @Coluna(nome = "ID", tipo = "bigint")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Coluna(nome = "CODIGO", tipo = "bigint", unique = true)
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Coluna(nome = "ATRIBUTO1", tipo = "varchar", size = 200)
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    @Coluna(nome = "ATRIBUTO2", tipo = "varchar", size = 10)
    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
}
