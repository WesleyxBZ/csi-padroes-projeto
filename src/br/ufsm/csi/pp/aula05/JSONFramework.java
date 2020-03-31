package br.ufsm.csi.pp.aula05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONFramework {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ClasseTeste classeTeste = new ClasseTeste();
        classeTeste.setData(new Date());
        classeTeste.setEndereco("Rua X");
        classeTeste.setId(10l);
        classeTeste.setNome("Fulano");
        classeTeste.setComprimento(11.1);
        classeTeste.setIds(new Integer[]{0, 1, 2, 3});
        System.out.println(new JSONFramework().geraJSON(classeTeste));
    }

    public String geraJSON(Object objeto) throws InvocationTargetException, IllegalAccessException {

        StringBuffer sb = new StringBuffer();
        sb.append("{");
        boolean primeira = true;

        for (Method metodo : objeto.getClass().getMethods()) {

            if (metodo.getName().startsWith("get") && metodo.getParameterCount() == 0 && metodo.getDeclaredAnnotation(JSON.class) != null) {

                if (!primeira) {
                    sb.append(", \n");
                } else {
                    primeira = false;
                }

                Class tipoDado = metodo.getReturnType();
                String nomeCampo = metodo.getName().substring(3, 4).toLowerCase() + metodo.getName().substring(4);
                sb.append("\"" + nomeCampo + "\": ");

                if (String.class.isAssignableFrom(tipoDado)) {
                    sb.append("\"" + metodo.invoke(objeto).toString() + "\"");
                } else if (Number.class.isAssignableFrom(tipoDado)) {
                    sb.append(metodo.invoke(objeto).toString());
                } else if (Date.class.isAssignableFrom(tipoDado)) {
                    SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    sb.append("\"" + SDF.format(metodo.invoke(objeto)) + "\"");
                } else if (tipoDado.isArray()) {
                    sb.append("[");
                    Object[] array = (Object[]) metodo.invoke(objeto);
                    boolean primeiroArray = true;
                    for (Object oArray : array) {
                        if (!primeiroArray) {
                            sb.append(", ");
                        } else {
                            primeiroArray = false;
                        }
                        sb.append(oArray.toString());
                    }
                    sb.append("]");
                } else {
                    sb.append("\"not supported\"");
                }

            }
        }

        sb.append("}");
        return sb.toString();
    }

}
