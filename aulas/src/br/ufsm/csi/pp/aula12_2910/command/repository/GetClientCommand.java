package br.ufsm.csi.pp.aula12_2910.command.repository;

import br.ufsm.csi.pp.aula12_2910.command.dao.ClientDAOCallBack;
import br.ufsm.csi.pp.aula12_2910.command.dao.DAOCommand;
import br.ufsm.csi.pp.aula12_2910.command.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetClientCommand implements DAOCommand {

    private Long idCliente;
    private ClientDAOCallBack clientDAOCallBack;

    public GetClientCommand(Long idCliente, ClientDAOCallBack clientDAOCallback) {
        this.idCliente = idCliente;
        this.clientDAOCallBack = clientDAOCallBack;
    }

    @Override
    public void execute(Connection connection) {
        String sql = "SELECT * FROM client WHERE id = ?";
        boolean result = false;
        Client client = new Client();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, idCliente);
            ResultSet rs;
            rs = preparedStatement.executeQuery();
            rs.next();
            if (rs.next()) {
                client.setId(rs.getLong("id"));
                client.setCpf(rs.getString("cpf"));
                client.setName(rs.getString("name"));
                result = true;
            }
            clientDAOCallBack.onExecute(result, (result ? 1 : 0), client);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
