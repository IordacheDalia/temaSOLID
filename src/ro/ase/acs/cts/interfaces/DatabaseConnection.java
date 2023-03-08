package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnection {
    Connection getConnection() throws SQLException;
}
