package javacore.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    private String cargo;

    // construtor - nao deve especificar nenhum retorno nome igual ao da classe
    // bom para definir regra - semelhante ao python _init
    public Funcionario(String nome, String cpf, float salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
    }

    // caso eu queira inicializar de mais de uma forma, sobrecarregamos
    public Funcionario() {

    }

    public void init(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // sobrecarga de métodos - digamos que precisaremos add mais atributos no
    // futuro, sem bagunçar o programa
    // nome igual e parametros diferentes
    public void init(String nome, String cpf, float salario, String cargo) {
        this.init(nome, cpf, salario);
        this.cargo = cargo;
    }

    public void printDados() {
        System.out.println(nome);
        System.out.println(salario);
        System.out.println(cpf);
        System.out.println(cargo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}
