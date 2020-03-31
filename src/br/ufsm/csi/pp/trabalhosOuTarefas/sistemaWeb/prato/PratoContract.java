package br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.prato;

import br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model.Prato;

import java.util.List;

public interface PratoContract {

    interface PratoPresenter {

        Prato savePrato(Prato prato);

        List<Prato> getPratos();

    }

    interface PratoView {

        void showPratos();

    }

}
