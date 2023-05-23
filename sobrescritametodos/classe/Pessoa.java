package javacore.sobrescritametodos.classe;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        // sobrescrevendo um metodo que foi definido na classe pai Object - tem que ter
        // msm nome e msm parametro
        // msm tipo de acesso, ou um menos restrito, retornar o msm tipo de variavel
        return "Nome: " + nome + "\nIdade: " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
