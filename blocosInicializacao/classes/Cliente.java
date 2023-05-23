package javacore.blocosInicializacao.classes;

public class Cliente {
    private int[] parcelas;

    // criando um bloco de inicialização
    {
        parcelas = new int[100];
        for (int i = 1; i < 101; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
