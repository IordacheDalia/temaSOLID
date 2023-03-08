package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.ReadData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataOperation implements ReadData {
    @Override
    public ResultSet read(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        return statement.executeQuery("SELECT * FROM employees");
    }
}
