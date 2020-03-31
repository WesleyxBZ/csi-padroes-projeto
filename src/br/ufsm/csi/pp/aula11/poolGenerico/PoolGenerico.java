package br.ufsm.csi.pp.aula11.poolGenerico;

import java.util.ArrayList;
import java.util.List;

public class PoolGenerico<T> implements Pool<T> {

    private final Class<T> classe;
    private final List<T> objetosDisponiveis = new ArrayList<>();
    private final List<T> objetosCriados = new ArrayList<>();

    public PoolGenerico(Class<T> classe) throws IllegalAccessException, InstantiationException {
        this.classe = classe;
        for (int i = 0; i < 3; i++) {
            T t = this.classe.newInstance();
            objetosDisponiveis.add(t);
            objetosCriados.add(t);
        }
    }

    @Override
    public T acquire() throws IllegalAccessException, InstantiationException, InterruptedException {
        synchronized (objetosDisponiveis) {
            if (!objetosDisponiveis.isEmpty()) {
                return objetosDisponiveis.remove(0);
            } else if (objetosCriados.size() < 20) {
                T instancia = classe.newInstance();
                objetosCriados.add(instancia);
                return instancia;
            } else {
                objetosDisponiveis.wait();
                return objetosDisponiveis.remove(0);
            }
        }
    }

    @Override
    public void release(T t) {
        synchronized (objetosDisponiveis) {
            if (!objetosDisponiveis.contains(t) &&
                    objetosCriados.contains(t)) {
                objetosDisponiveis.add(t);
                if (objetosDisponiveis.size() == 1) {
                    objetosDisponiveis.notify();
                }
            }
        }
    }

}
