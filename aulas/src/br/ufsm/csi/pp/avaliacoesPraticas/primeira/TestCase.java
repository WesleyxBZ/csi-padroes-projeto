package br.ufsm.csi.pp.avaliacoesPraticas.primeira;

import br.ufsm.csi.pp.avaliacoesPraticas.primeira.exemplo.ClasseExemplo;
import br.ufsm.csi.pp.avaliacoesPraticas.primeira.formGenerator.FormGenerator;
import br.ufsm.csi.pp.avaliacoesPraticas.primeira.formGenerator.FormGeneratorImpl;

public class TestCase {

    public static void main(String[] args) {

        FormGenerator formGenerator = FormGeneratorImpl.getInstance();
        ClasseExemplo classeExemplo = new ClasseExemplo();
        classeExemplo.setAtivo(true);
        classeExemplo.setId((long) 111);
        classeExemplo.setCodigo((long) 1000);
        classeExemplo.setAtributo1("asdfadsfasdfasdfasdfasdfasdfasdf");
        System.out.println(formGenerator.generateForm(classeExemplo));

    }

}
