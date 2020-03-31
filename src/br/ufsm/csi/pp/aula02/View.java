package br.ufsm.csi.pp.aula02;

import br.ufsm.csi.pp.aula02.formas.Quadrado;
import br.ufsm.csi.pp.aula02.formas.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class View {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(3.0);
        Retangulo retangulo = new Retangulo(2.0, 3.0);

        Peca quantoSolteiro = new Peca(3.0, "Quarto de solteiro");
        quantoSolteiro.addFormaGeometrica(quadrado);
        quantoSolteiro.addFormaGeometrica(retangulo);

        Peca sala = new Peca(3.0, "Sala de estar");
        sala.addFormaGeometrica(retangulo);

        List<Peca> pecas = new ArrayList<>();
        pecas.add(quantoSolteiro);
        pecas.add(sala);

        Imovel imovel = new Imovel(pecas, "Casa 101", "João", "Rua x, nº1",
                Imovel.TipoImovel.RESIDENCIAL);

        System.out.println("\nPeças:");
        for (Peca peca: imovel.getPecas()) {
            System.out.println(" + " + peca.getIdentificacao() + ": " + peca.getVolume());
        }
        System.out.println("\nO volume total do imóvel é de: " + imovel.getVolume());

    }

}
