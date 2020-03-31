package br.ufsm.csi.pp.aula12.command.repository;

import java.sql.Connection;

public interface DAOCommand {

    void execute(Connection connection);

}
