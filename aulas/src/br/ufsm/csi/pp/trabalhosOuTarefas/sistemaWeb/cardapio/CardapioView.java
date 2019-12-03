package br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.cardapio;

import br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model.Cardapio;
import br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model.Prato;
import br.ufsm.csi.pp.trabalhosOuTarefas.sistemaWeb.model.Restaurante;

import java.time.LocalDate;

public class CardapioView implements CardapioContract.CardapioView {

    CardapioContract.CardapioPresenter cardapioPresenter;

    @Override
    public void show() {
        cardapioPresenter.find();
    }

    @Override
    public void save() {

        Restaurante r = new Restaurante(1L, "Dona Benta", "1254684578/45", "55900000000");

        Prato p1 = new Prato(
                1L,
                "Macarrão alho e óleo",
                "Macarrão alho e óleo",
                "Macarrão, Alho, Óleo de soja, Sal",
                r);

        Prato p2 = new Prato(
                1L,
                "Batata rústica",
                "Batatas rústicas",
                "Batata, Alho, Sal, Pimenta, Alegrim, Azeite de oliva",
                r);

        // ... entre outros pratos

        LocalDate date = LocalDate.of(2019, 12, 03);
        Cardapio c = new Cardapio
                .Builder(1L, r, date)
                .prato(p1)
                .prato(p2)
                .build();

    }


}
