package br.ufsm.csi.pp.aula12.command.dao;

public interface ClientDAOCallBack {

    void onExecute(boolean success, int rowsAffected, Object o);

}
