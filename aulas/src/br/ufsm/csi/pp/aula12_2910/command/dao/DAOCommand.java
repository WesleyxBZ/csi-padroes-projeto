package br.ufsm.csi.pp.aula12_2910.command.dao;

import java.sql.Connection;

public interface DAOCommand {

    void execute(Connection connection);

}
