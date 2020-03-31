package br.ufsm.csi.pp.aula12.command.repository;

import br.ufsm.csi.pp.aula12.command.dao.ClientDAOCallBack;
import br.ufsm.csi.pp.aula12.command.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveClientCommand implements DAOCommand {

    private Client client;
    private ClientDAOCallBack clientDAOCallBack;

    public RemoveClientCommand(Client client, ClientDAOCallBack clientDAOCallback) {
        this.client = client;
        this.clientDAOCallBack = clientDAOCallBack;
    }

    @Override
    public void execute(Connection connection) {
        String sql = "DELETE client WHERE id = ?";
        boolean result = false;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, client.getId());
            result = preparedStatement.execute();
            clientDAOCallBack.onExecute(result, (result ? 1 : 0), client);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
