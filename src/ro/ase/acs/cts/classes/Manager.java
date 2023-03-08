package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
    private final DatabaseConnection databaseConnection;
    private final CreateTable createTable;
    private final InsertData insertData;
    private final ReadData readData;
    private final WriteData writeData;

    public Manager(DatabaseConnection databaseConnection, CreateTable createTable, InsertData insertData, ReadData readData, WriteData writeData) {
        this.databaseConnection = databaseConnection;
        this.createTable = createTable;
        this.insertData = insertData;
        this.readData = readData;
        this.writeData = writeData;
    }


    public void run(){
        try {
            Connection connection=databaseConnection.getConnection();
            createTable.create(connection);

            insertData.insert(connection);

            ResultSet resultSet=readData.read(connection);
            writeData.display(resultSet);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
