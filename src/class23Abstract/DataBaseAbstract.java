package class23Abstract;

public abstract class DataBaseAbstract {
    abstract void openDataBase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
//Hover over the error and click on the implement methods option
//if we want to choose not all parent methods, we should type abstract child class!
class MicrosoftDataBase extends DataBaseAbstract {

    @Override
    void openDataBase() {
        System.out.println("Opening the Microsoft Database");
    }
    @Override
    void readData() {
        System.out.println("Reading the data from MSDatabase");
    }
    @Override
    void writeData() {
        System.out.println("writing the data to MSDatabase");
    }
    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}
class Oracle extends DataBaseAbstract {

    @Override
    void openDataBase() {
        System.out.println("Opening the Oracle Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeData() {
        System.out.println("writing the data to Oracle database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}
class testerDataBase{
    public static void main(String[] args) {
        DataBaseAbstract  dataBase=new MicrosoftDataBase();
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}