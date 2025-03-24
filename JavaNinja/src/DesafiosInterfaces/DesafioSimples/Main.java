package DesafiosInterfaces.DesafioSimples;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito();
        Pagamento pagamentoPix = new PagamentoPix();

        pagamentoCartaoCredito.realizarPagamento(45.90);
        pagamentoPix.realizarPagamento(200.20);
    }
}
