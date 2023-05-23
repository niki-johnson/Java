package javacore.polimorfismo.classes;

public class DatabaseDAO implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando daods no banco de dados");
    }

}
