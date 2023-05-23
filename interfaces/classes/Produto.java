package javacore.interfaces.classes;

//interface é uma classe completamente abstrata
//diz oq a classe deve fazer, mas n diz como fazer
public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco * IMPOSTO + this.preco;
    }

    @Override
    public void calculaFrete() {
        valorFrete = this.preco / this.peso * 0.1;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco + ", precoFinal=" + precoFinal
                + ", valorFrete=" + valorFrete + "]";
    }

}
