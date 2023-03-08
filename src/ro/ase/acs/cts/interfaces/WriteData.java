package ro.ase.acs.cts.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface WriteData {
    void display(ResultSet resultSet) throws SQLException;
}
