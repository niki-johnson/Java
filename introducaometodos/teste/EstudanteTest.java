package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.setNome("Joao");
        joao.setNotas(new float[] { 0, 8, 9 });
        joao.setIdade(15);
        joao.imprimirDados();
        System.out.println(joao.getNome());
    }
}
