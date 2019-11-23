package br.ufsm.csi.pp.aula11_1510.poolGenerico;

public interface Pool<T> {

    T acquire() throws IllegalAccessException, InstantiationException, InterruptedException;
    void release(T t);

}
