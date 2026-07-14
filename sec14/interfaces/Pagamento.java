package sec14.interfaces;

interface Pagamento {
    // Método abstrato
    void processarPagamento(double valor);
    // Método default
    default void exibirRecibo(double valor) {
        System.out.println("Recibo do Pagamento, com valor de R$" + valor);
    }
}
