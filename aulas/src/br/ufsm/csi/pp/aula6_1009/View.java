package br.ufsm.csi.pp.aula6_1009;

public class View {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Banco banco = new Banco(1l, "Banco x");
        System.out.println(s.criar(banco));

    }

}
