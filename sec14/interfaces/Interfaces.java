package sec14.interfaces;

public class Interfaces {
    public static void main(String[] args) {
        /**
         * É um contrato que define umc conjunto de métodos que uma classe deve implementar.
         * 
         * Ela não fornece uma implementação desses métodos, apenas suas assinaturas.
         * 
         * Uma classe pode implementar múltiplas interfaces, permitindo maoir flexibilidade em comparação à herança simples.
         * 
         * As intefaces são ideais para definir comportamentos que podem ser compartihlados por classes não relacionadas.
         * 
         * Desde java 8, interfaces podem conter métodos concretos  com a palavra default
         */

        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new TransferenciaBancaria();

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(200);
        transf.exibirRecibo(200);
    }
}
