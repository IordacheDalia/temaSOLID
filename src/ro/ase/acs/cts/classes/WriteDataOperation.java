package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.WriteData;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WriteDataOperation implements WriteData {
    @Override
    public void display(ResultSet resultSet) throws SQLException {
        while(resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
            System.out.println("address: " + resultSet.getString("address"));
            System.out.println("salary: " + resultSet.getDouble("salary"));
        }
        resultSet.close();
    }
}
