package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.*;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager(new DatabaseConnectionOperation(), new CreateTableOperation(), new InsertDataOperation(),new ReadDataOperation(),new WriteDataOperation());
        //manager.run();


    }


}