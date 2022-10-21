package class23Abstract;
//if we don't want ot implement some method from interface we should just type abstract of subclass
public interface IDataBaseINTERFACE {
    void openDataBase();
    void readData();
    void writeData();
}
class IBM implements IDataBaseINTERFACE {

    @Override
    public void openDataBase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data from the IBM Database");
    }
}
class testerInterface{
    public static void main(String[] args) {
        IDataBaseINTERFACE iDataBase=new IBM();
        iDataBase.openDataBase();
        iDataBase.readData();
        iDataBase.writeData();
    }
}