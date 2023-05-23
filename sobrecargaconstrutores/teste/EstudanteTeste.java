package javacore.sobrecargaconstrutores.teste;

import javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("Jonata", "12345-56", new float[] { 5, 8, 6 });
        aluno.imprimirDados();
    }
}
