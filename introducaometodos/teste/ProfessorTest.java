package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mateus";
        professor.rg = "12345697-39";
        professor.cpf = "21234579243";
        professor.imprimirDados();

        Professor professor2 = new Professor();
        professor2.nome = "Joao";
        professor2.rg = "444.333.222-11";
        professor2.cpf = "142.564.95-30";
        System.out.println(' ');
        professor2.imprimirDados();

        professor = professor2;
        System.out.println(' ');
        professor.imprimirDados();

    }

}
