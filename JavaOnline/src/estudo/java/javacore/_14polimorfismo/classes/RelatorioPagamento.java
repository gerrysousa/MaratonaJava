package estudo.java.javacore._14polimorfismo.classes;

public class RelatorioPagamento {

  public void relatorioPagamentoGerente(Gerente gerente) {
    System.out.println("Gerando relatorio de pagamentos para a gerencia");
    gerente.calcularPagamentos();
    System.out.println("Nome: " + gerente.getNome());
    System.out.println("Salario desse mes:" + gerente.getSalario());
  }
  public void relatorioPagamentoVendedor(Vendedor vendedor) {
    System.out.println("Gerando relatorio de pagamentos para vendedores");
    vendedor.calcularPagamentos();
    System.out.println("Nome: " + vendedor.getNome());
    System.out.println("Salario desse mes:" + vendedor.getSalario());
  }

  public void relatorioPagamentoGenerico(Funcionario funcionario) {
    System.out.println("Gerando relatorio de pagamentos Generico");
    funcionario.calcularPagamentos();
    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("Salario desse mes:" + funcionario.getSalario());

    if (funcionario instanceof Gerente){
      Gerente g = (Gerente) funcionario;
      System.out.println("Participacao nos lucros: "+g.getPl());
    }
    if (funcionario instanceof Vendedor){
      System.out.println("Total de vendas: "+((Vendedor) funcionario).getTotalVendas());
    }
  }
}
