package javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome) {
        super(nome);// deve ser a 1 linha do construtor -> tem que por em funcionario ja que pessoa
                    // obriga inicalizar com um nome como argumento
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
