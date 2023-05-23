package javacore.introducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private float[] notas;

    public String calcularMediaNotas() {
        float media = 0;
        for (float nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public void imprimirDados() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("Você foi: " + calcularMediaNotas());

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float[] getNotas() {
        return this.notas;
    }
}
