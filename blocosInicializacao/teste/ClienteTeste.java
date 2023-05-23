package javacore.blocosInicializacao.teste;

import javacore.blocosInicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("\nDentro da classe teste");
        for (int parcela : cliente.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
