package br.ufsm.csi.pp.aula4_2708;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionBanco {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, InvocationTargetException {

        // String nomeClasse = args[0];
        Class classe = Class.forName("br.ufsm.csi.pp.aula3_4_2008_2708.meuCodigo.Conta");
        Object instancia = classe.newInstance();

        for (Field field : classe.getDeclaredFields()) {
            int mod = field.getModifiers();
            System.out.println((Modifier.isAbstract(mod) ? "abstract " : "") +
                    (Modifier.isPrivate(mod) ? "private " : "") +
                    (Modifier.isPublic(mod) ? "public " : "") +
                    (Modifier.isProtected(mod) ? "protected " : "") +
                    field.getType().getSimpleName() + " " + field.getName() + ";");
        }

        for (Method method : classe.getDeclaredMethods()) {
            System.out.println(method);
            if (method.getName().equals("setNomePessoa")) {
               method.invoke(instancia, "Maria");
            }
        }


    }

}
