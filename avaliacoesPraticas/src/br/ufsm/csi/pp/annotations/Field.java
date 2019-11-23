package br.ufsm.csi.pp.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Field {

    public String name();
    public FieldType type() default FieldType.TEXT;
    public int size() default 0;
    public String label() default "";

    public enum FieldType {
        HIDDEN, TEXT, TEXTAREA
    }

}
