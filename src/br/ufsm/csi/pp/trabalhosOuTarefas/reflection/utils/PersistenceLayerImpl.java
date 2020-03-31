package br.ufsm.csi.pp.trabalhosOuTarefas.reflection.utils;

import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.annotations.Coluna;
import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.annotations.Tabela;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PersistenceLayerImpl implements PersistenceLayer {

    private static PersistenceLayerImpl INSTANCE;

    private PersistenceLayerImpl() {
    }

    public static PersistenceLayerImpl getInstance() {
        synchronized (PersistenceLayerImpl.class) {
            if (PersistenceLayerImpl.INSTANCE == null) {
                PersistenceLayerImpl.INSTANCE = new PersistenceLayerImpl();
            }
            return PersistenceLayerImpl.INSTANCE;
        }
    }

    @Override
    public String generateCreateTable(Class[] classes) {

        try {

            StringBuilder createCommand = new StringBuilder();
            int colunas;
            int cont;
            String pk;

            for (Class aClass : classes) {

                Class classe = Class.forName(aClass.getName());
                Object instancia = classe.newInstance();
                pk = "";
                colunas = 0;
                cont = 0;
                createCommand.append("CREATE TABLE ");

                for (Annotation annotationn : classe.getAnnotations()) {
                    if (annotationn.annotationType().isAssignableFrom(Tabela.class)) {
                        Tabela tabela = (Tabela) annotationn;
                        createCommand.append(tabela.nome()).append(" (");
                    }
                }

                for (Method metodo : classe.getDeclaredMethods()) {
                    if (metodo.isAnnotationPresent(Coluna.class)) {
                        colunas++;
                    }

                    Annotation[] annotations = metodo.getDeclaredAnnotations();

                    for (Annotation annotation : annotations) {
                        if (annotation.toString().contains("ChavePrimaria")) {
                            Coluna anotacao = metodo.getAnnotation(Coluna.class);
                            pk = "primary key(" + anotacao.nome() + ")";
                        }
                    }
                }

                for (Method metodo : classe.getDeclaredMethods()) {

                    if (metodo.isAnnotationPresent(Coluna.class)) {
                        cont++;
                        Coluna anotacao = metodo.getAnnotation(Coluna.class);
                        createCommand.append(anotacao.nome()).append(" ").append(anotacao.tipo());

                        if (anotacao.tipo().equals("varchar")) {
                            createCommand.append("(").append(anotacao.size()).append(")");
                        }

                        if (cont != colunas) {
                            createCommand.append(", ");
                        }
                    }
                }

                createCommand.append(", ").append(pk).append(");").append("\n");
            }

            return createCommand.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Algo de errado ocorreu";
    }

}