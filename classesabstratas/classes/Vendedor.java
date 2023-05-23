package javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario * 0.05 + this.salario;
    }
}
