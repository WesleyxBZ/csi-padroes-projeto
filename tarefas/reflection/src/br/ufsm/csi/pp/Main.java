package br.ufsm.csi.pp;

import br.ufsm.csi.pp.model.ClasseExemplo;
import br.ufsm.csi.pp.model.Pessoa;
import br.ufsm.csi.pp.utils.PersistenceLayer;
import br.ufsm.csi.pp.utils.PersistenceLayerImpl;

public class Main {

    public static void main(String[] args) {
        PersistenceLayer persistenceLayer = PersistenceLayerImpl.getInstance();
        System.out.println("\n" + persistenceLayer.generateCreateTable(new Class[] { ClasseExemplo.class, Pessoa.class }));
    }

}
