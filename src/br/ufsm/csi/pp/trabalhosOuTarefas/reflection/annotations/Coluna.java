package br.ufsm.csi.pp.trabalhosOuTarefas.reflection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by politecnico on 09/10/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Coluna {

    public String nome();
    public String tipo();
    public int size() default 0;
    public boolean unique() default false;

}
