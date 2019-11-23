package br.ufsm.csi.pp.exemplo;

import br.ufsm.csi.pp.annotations.Field;
import br.ufsm.csi.pp.annotations.Form;

/**
 * Created by politecnico on 09/10/2017.
 */
@Form(name = "exemplo", action = "/formexemplo.servlet", submitButton = "Enviar")
public class ClasseExemplo {

    private Long id;
    private Long codigo;
    private String atributo1;
    private String atributo2;
    private boolean ativo;

    @Field(name = "id", type = Field.FieldType.HIDDEN)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Field(name = "codigo", size = 5, label = "Código")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Field(name = "att1", type = Field.FieldType.TEXTAREA, label = "Atributo 1")
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    @Field(name = "ativo", label = "Ativo?")
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

}
