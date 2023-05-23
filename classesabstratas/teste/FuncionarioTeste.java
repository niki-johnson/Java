package javacore.classesabstratas.teste;

import javacore.classesabstratas.classes.Gerente;
import javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("marcos", "3543895", 2000);
        Vendedor v = new Vendedor("mateus", "85495302", 2000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
