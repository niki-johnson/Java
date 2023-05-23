package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;

public class Parametros {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 6;

        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Saindo da função calculadora");
        System.out.println(num1);
        System.out.println(num2);
    }

}
