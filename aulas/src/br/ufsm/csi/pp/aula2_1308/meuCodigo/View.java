package br.ufsm.csi.pp.aula2_1308.meuCodigo;

import br.ufsm.csi.pp.aula2_1308.meuCodigo.formas.Quadrado;
import br.ufsm.csi.pp.aula2_1308.meuCodigo.formas.Retangulo;

public class View {

    public static void main(String[] args) {

        Quadrado q = new Quadrado(3.0);
        Retangulo r = new Retangulo(1.0, 3.0);

        Peca peca = new Peca(3.0, "Quarto de solteiro");
        peca.setFormaGeometrica(q);
        peca.setFormaGeometrica(r);

        System.out.println("O volume da peça " + peca.getIdentificacao() + " é " + peca.getVolume());

    }

}
