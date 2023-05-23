package javacore.introclasses.test;

import javacore.introclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mateus";
        professor.rg = "12345697-39";
        professor.cpf = "21234579243";

        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        Professor professor2 = new Professor();
        professor2.nome = "Joao";
        professor2.rg = "444.333.222-11";
        professor2.cpf = "142.564.95-30";
        System.out.println(' ');
        System.out.println(professor2.nome);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);

        professor = professor2;
        System.out.println(' ');
        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

    }

}
