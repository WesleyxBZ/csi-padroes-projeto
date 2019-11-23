package br.ufsm.csi.pp.formGenerator;

import br.ufsm.csi.pp.annotations.Field;
import br.ufsm.csi.pp.annotations.Form;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

public class FormGeneratorImpl implements FormGenerator {

    private static FormGeneratorImpl INSTANCE;

    private FormGeneratorImpl() {
    }

    public static FormGeneratorImpl getInstance() {
        synchronized (FormGeneratorImpl.class) {
            if (FormGeneratorImpl.INSTANCE == null) {
                FormGeneratorImpl.INSTANCE = new FormGeneratorImpl();
            }
            return FormGeneratorImpl.INSTANCE;
        }
    }

    @Override
    public String generateForm(Object objeto) {

        StringBuilder pagina = new StringBuilder();
        Boolean temAnotacaoForm = false;

        try {

            Class classe = Class.forName(objeto.getClass().getName());
            Object newInstance = classe.newInstance();
            String type = "";
            String name = "";
            String label = "";
            int size = 0;
            String submitButton = "";

            pagina.append("<form ");

            // Anotação na classe
            for (Annotation anotacao : classe.getAnnotations()) {
                if (anotacao.annotationType().isAssignableFrom(Form.class)) {
                    temAnotacaoForm = true;
                    Form form = (Form) anotacao;
                    submitButton = form.submitButton();
                    pagina.append("name=\"" + form.name() + "\" action=\"" + form.action() + "\">\n");
                }
            }

            if (temAnotacaoForm) {

                // Anotação nos métodos
                for (Method metodo : classe.getDeclaredMethods()) {

                    if (metodo.isAnnotationPresent(Field.class)) {
                        Field anotacao = metodo.getAnnotation(Field.class);
                        type = anotacao.type().toString().toLowerCase();
                        name = anotacao.name();
                        label = anotacao.label();
                        size = anotacao.size();

                        pagina.append("<div>\n");

                        if (type.equals("hidden")) {
                            pagina.append("   <input type=\"" + type + "\" name=\"" + name + "\" " + "id=\"" + name +
                                    "\" value=\"" + size + "\"/>\n");
                        } else if (type.equals("textarea")) {
                            pagina.append("   <textarea name=\"" + name + "\" id=\"" + name +
                                    "\"> Alguma coisa... </textarea>\n");
                            pagina.append("   <label for=\"" + name + "\">" + label + "</label>\n");
                        } else if (metodo.getGenericReturnType().getTypeName().contains("boolean")) {
                            pagina.append("   <input type=\"checkbox\" name=\"" + name + "\" " +
                                    "id=\"" + name + "\" checked\">\n");
                            pagina.append("   <label for=\"" + name + "\">" + label + "</label>\n");
                        } else {
                            pagina.append("   <input type=\"" + type + "\" name=\"" + name + "\" "
                                    + "id=\"" + name + "\" value=\"" + size + "\"/>\n");
                            pagina.append("   <label for=\"" + name + "\">" + label + "</label>\n");
                        }
                        pagina.append("</div>\n");
                    }

                }

                pagina.append("<div>\n" +
                        "   <input type=\"submit\" value=\"" + submitButton + "\" />\n" +
                        "</div>\n" +
                        "</form>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (temAnotacaoForm) {
            return pagina.toString();
        }

        return "Classe sem anotação @Form";
    }

    @Override
    public Object populateObject(Map<String, String> parametrosRequisicao, Class classe) {
        return null;
    }

}
