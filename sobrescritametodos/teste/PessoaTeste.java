package javacore.sobrescritametodos.teste;

import javacore.sobrescritametodos.classe.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(76);
        System.out.println(p);
    }
}
