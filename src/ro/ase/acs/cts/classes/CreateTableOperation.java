package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.CreateTable;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableOperation implements CreateTable {
    @Override
    public void create(Connection connection) throws SQLException {

        Statement statement=connection.createStatement();
        statement.executeUpdate("DROP TABLE IF EXISTS employees");
        statement.executeUpdate( "CREATE TABLE employees(id INTEGER PRIMARY KEY, name TEXT, address TEXT, salary REAL)");
       statement.close();


    }
}
