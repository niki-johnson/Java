package javacore.sobrecargaconstrutores.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private float[] notas;
    private String dataMatricula;

    public Estudante(String nome, String matricula, float[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, float[] notas, String dataMatricula) {
        // como chamar outro construtor:
        // outro construtor deve ser a 1 linha e só podem ser chamados por outros
        // construtores
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;

    }

    public Estudante() {

    }

    public void imprimirDados() {
        System.out.println(nome);
        System.out.println(matricula);
        for (float nota : notas) {
            System.out.println(nota);
        }
        System.out.println(dataMatricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
