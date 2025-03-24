package DesafiosInterfaces.DesafioSimples;

public class PagamentoPix  implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando o pagamento de Pix no valor de: R$ "+ valor);
    }
}
