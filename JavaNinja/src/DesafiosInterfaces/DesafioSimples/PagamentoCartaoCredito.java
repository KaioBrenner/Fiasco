package DesafiosInterfaces.DesafioSimples;

public class PagamentoCartaoCredito  implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando o pagamento de cartão de crédito no valor de: R$ "+ valor);

        System.out.println(String.format("Realizando o pagamento de cartão de crédito no valor de: R$ %s", valor));
    }
}
