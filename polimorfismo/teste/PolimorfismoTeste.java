package javacore.polimorfismo.teste;

import javacore.polimorfismo.classes.Gerente;
import javacore.polimorfismo.classes.Relatorio;
import javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Mateus", 2000, 2000);
        Vendedor v = new Vendedor("Iuri", 1500, 20000);
        Relatorio relatorio = new Relatorio();
        // relatorio.pagamentoGerente(g);
        // relatorio.pagamentoVendedor(v);
        relatorio.pagamentoGenerico(v);
        relatorio.pagamentoGenerico(g);

    }
}
