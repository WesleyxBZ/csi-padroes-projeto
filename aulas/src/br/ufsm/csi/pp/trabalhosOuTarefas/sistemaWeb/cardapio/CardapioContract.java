package br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.cardapio;

import br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model.Cardapio;

public interface CardapioContract {

    interface CardapioPresenter {

        Cardapio save();

        Cardapio find();

    }

    interface CardapioView {

        void show();

        void save();

    }

}
