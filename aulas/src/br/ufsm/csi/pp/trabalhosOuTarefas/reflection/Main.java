package br.ufsm.csi.pp.trabalhosOuTarefas.reflection;

import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.model.ClasseExemplo;
import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.model.Pessoa;
import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.utils.PersistenceLayer;
import br.ufsm.csi.pp.trabalhosOuTarefas.reflection.utils.PersistenceLayerImpl;

public class Main {

    public static void main(String[] args) {
        PersistenceLayer persistenceLayer = PersistenceLayerImpl.getInstance();
        System.out.println("\n" + persistenceLayer.generateCreateTable(new Class[]{ClasseExemplo.class, Pessoa.class}));
    }

}
