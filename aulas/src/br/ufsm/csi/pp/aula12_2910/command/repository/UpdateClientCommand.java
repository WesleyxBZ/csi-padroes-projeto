package br.ufsm.csi.pp.aula12_2910.command.repository;

import br.ufsm.csi.pp.aula12_2910.command.dao.ClientDAOCallBack;
import br.ufsm.csi.pp.aula12_2910.command.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateClientCommand implements DAOCommand {

    private Client client;
    private ClientDAOCallBack clientDAOCallBack;

    public UpdateClientCommand(Client client, ClientDAOCallBack clientDAOCallback) {
        this.client = client;
        this.clientDAOCallBack = clientDAOCallBack;
    }

    @Override
    public void execute(Connection connection) {
        String sql = "UPDATE client SET cpf = ?, name = ? WHERE id = ?";
        boolean result = false;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, client.getCpf());
            preparedStatement.setString(2, client.getName());
            preparedStatement.setLong(3, client.getId());
            result = preparedStatement.execute();
            clientDAOCallBack.onExecute(result, (result ? 1 : 0), client);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
