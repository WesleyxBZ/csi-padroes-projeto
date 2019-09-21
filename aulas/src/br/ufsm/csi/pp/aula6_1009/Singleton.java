package br.ufsm.csi.pp.aula6_1009;

public class Singleton implements Generic<Banco> {

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

    @Override
    public boolean criar(Banco banco) {
        return true;
    }

    @Override
    public boolean deletar(Banco banco) {
        return true;
    }

    @Override
    public Banco get(Banco banco) {
        return banco;
    }

}
