package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertData {
    void insert(Connection connection) throws SQLException;
}
