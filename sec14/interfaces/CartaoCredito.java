package sec14.interfaces;

public class CartaoCredito implements Pagamento {
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Cartão de Crédito");
    }
}
