package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.classe.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro porshe = new Carro("Porsche", "911 GT", 320);
        Carro benz = new Carro("Mercedes", "c180", 250);
        Carro bmw = new Carro("BMW", "M5", 300);
        Carro.setVelLimite(210);
        System.out.println(Carro.getVelLimite());
        porshe.imprimir();
        bmw.imprimir();
        benz.imprimir();
    }
}
