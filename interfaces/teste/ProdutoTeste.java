package javacore.interfaces.teste;

import javacore.interfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto("notebook", 4, 3000);
        p.calculaFrete();
        p.calcularImposto();
        System.out.println(p);
    }

}
