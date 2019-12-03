package br.ufsm.csi.pp.avaliacoesPraticas.primeira.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Form {

    public String name();
    public String action();
    public String submitButton() default "Submit";

}
