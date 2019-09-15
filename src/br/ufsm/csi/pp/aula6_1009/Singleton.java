package br.ufsm.csi.pp.aula6_1009;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){ }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new Singleton();
            }
            return INSTANCE;
        }
    }

}
