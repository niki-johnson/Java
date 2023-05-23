package javacore.modificadorfinal.teste;

import javacore.modificadorfinal.classes.Carro;

public class CarroTst {
    public static void main(String[] args) {
        Carro c = new Carro();
        // Carro.VELOCIDADE_LIMITE = 280; // erro proposital para entender comportamento
        // varivaeis primitivas
        System.out.println(c.getComprador());
        c.getComprador().setNome("Cristiano");
        System.out.println(c.getComprador());

    }

}
