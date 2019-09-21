package br.ufsm.csi.pp.aula6_1009;

public interface Generic<T> {

    boolean criar(T t);

    boolean deletar(T t);

    T get(T t);

}
