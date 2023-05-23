package javacore.polimorfismo.classes;

public class Relatorio {

    public void pagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento de funcionario");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        // fazendo um cast explicito
        // como estamos fazendo um polimorfismo MENOS genérico avisamos o java com
        // parenteses
        if (funcionario instanceof Gerente) {
            System.out.println("participação nos lucros: " + ((Gerente) funcionario).getPnl());
        } else {
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
