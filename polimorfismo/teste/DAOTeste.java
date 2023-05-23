package javacore.polimorfismo.teste;

import javacore.polimorfismo.classes.DatabaseDAO;
import javacore.polimorfismo.classes.GenericDAO;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAO();
        arquivoDAO.save();
    }
}
