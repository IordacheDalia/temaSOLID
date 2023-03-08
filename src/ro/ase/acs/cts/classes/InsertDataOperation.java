package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.InsertData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataOperation implements InsertData {
    @Override
    public void insert(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        statement.executeUpdate("INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)");
        statement.close();

        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO employees VALUES (?,?,?,?)");
        preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Ionescu Vasile");
        preparedStatement.setString(3, "Brasov");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}
