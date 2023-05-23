package javacore.sobrecargametodos.teste;

import javacore.sobrecargametodos.classes.Funcionario;

public class Funcionarioteste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Chica da Silva", "011.334.679-32", 3500, "intern");
        funcionario.printDados();

    }
}
