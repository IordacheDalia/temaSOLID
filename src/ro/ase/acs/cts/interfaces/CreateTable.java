package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateTable {

    void create(Connection connection) throws SQLException;
}
