package javacore.modificadorfinal.classes;

public class Carro {
    private String nome;
    private String marca;
    public static final float VELOCIDADE_LIMITE = 250; // nao modificavel- por ser final -> precisa ser inicializada
    private final Comprador comprador = new Comprador();

    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", marca=" + marca + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
