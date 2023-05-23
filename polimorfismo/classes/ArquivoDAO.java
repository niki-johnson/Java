package javacore.polimorfismo.classes;

public class ArquivoDAO implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no arquivo");
    }

}
