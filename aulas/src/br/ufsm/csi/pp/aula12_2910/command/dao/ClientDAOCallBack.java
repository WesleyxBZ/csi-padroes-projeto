package br.ufsm.csi.pp.aula12_2910.command.dao;

public interface ClientDAOCallBack {

    void onExecute(boolean success, int rowsAffected, Object o);

}
