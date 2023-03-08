package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionOperation implements DatabaseConnection {

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:database.db");
    }
}
