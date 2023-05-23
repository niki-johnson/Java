package javacore.heranca.classes;

public class Pessoa {
    protected String nome; // protected permite o acesso por classes filhas ou outras classes do mesmo
                           // pacote
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getRua());
        System.out.println(endereco.getBairro());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
