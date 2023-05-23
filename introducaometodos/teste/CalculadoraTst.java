package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTst {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(3d, 4);
        System.out.println(calc.divideDoisNumeros(22, 0));
        calc.soma(1, 2, 3, 4, 5);
    }

}
