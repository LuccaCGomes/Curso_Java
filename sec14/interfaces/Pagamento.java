package sec14.interfaces;

interface Pagamento {
    // Método abstrato
    void processarPagamento(double valor);
    
    // Método default
    /*
        São métodos concretos(com implementação) dentro das interfaces
        
        Permitem adicionar novas funcionalidades a interfaces existentes sem 
        quebrar a compatibilidade com  classes que já as implementam

        Com o método default podemos fornecer uma implementação padrão que
        PODE OU NÃO ser sobrescrita pelas classes que implementarem a interface
    */
    default void exibirRecibo(double valor) {
        System.out.println("Recibo do Pagamento, com valor de R$" + valor);
    }
}
