package br.ufsm.csi.pp.aula6_1009;

public interface Prototype<T> {

    T acquire();

    void release(T t);

    T clone();

}
