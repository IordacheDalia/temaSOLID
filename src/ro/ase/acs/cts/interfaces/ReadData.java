package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ReadData {
    ResultSet read(Connection connection) throws SQLException;
}
