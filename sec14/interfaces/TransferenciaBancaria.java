package sec14.interfaces;

public class TransferenciaBancaria implements Pagamento {
   
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Transferência Bancária");
    }

    @Override
    public void exibirRecibo(double valor) {
        System.out.println("O valor de R$" + valor + " foi transferido  para o banco");
    }
}
