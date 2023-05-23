package javacore.heranca.teste;

import javacore.heranca.classes.Endereco;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Mateus");
        p.setCpf("0123445678");
        Endereco end = new Endereco();
        end.setBairro("Candeias");
        end.setRua("Av Brasil");
        p.setEndereco(end);

        p.imprimir();

        Funcionario f = new Funcionario("leandro");
        f.setCpf("43758973498");
        f.setEndereco(end);
        f.setSalario(6000);
        f.imprimir();
    }
}
