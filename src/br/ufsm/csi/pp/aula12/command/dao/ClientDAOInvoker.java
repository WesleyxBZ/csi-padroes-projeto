package br.ufsm.csi.pp.aula12.command.dao;

import br.ufsm.csi.pp.aula12.command.model.Client;
import br.ufsm.csi.pp.aula12.command.repository.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOInvoker {

    private DataSource dataSource;
    private List<DAOCommand> commands = new ArrayList<>();

    public ClientDAOInvoker(DataSource dataSource, List<DAOCommand> commands) {
        this.dataSource = dataSource;
        this.commands = commands;
    }

    public void addCommand(DAOCommand command) {
        synchronized (commands) {
            commands.add(command);
            if (commands.size() == 10) {
                Connection connection = null;
                try {
                    connection = dataSource.getConnection();
                    for (DAOCommand com : commands) {
                        com.execute(connection);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                    }
                }
            }
            commands.clear();
        }
    }

    public ClientDAOInvoker(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertClient(Client client, ClientDAOCallBack clientDAOCallback) {
        addCommand(new InsertClientCommand(client, clientDAOCallback));
    }

    public void getClient(Long id, ClientDAOCallBack callback) {
        addCommand(new GetClientCommand(id, callback));
    }

    public void removeClient(Client client, ClientDAOCallBack callback) {
        addCommand(new RemoveClientCommand(client, callback));
    }

    public void updateClient(Client client, ClientDAOCallBack callback) {
        addCommand(new UpdateClientCommand(client, callback));
    }

}
