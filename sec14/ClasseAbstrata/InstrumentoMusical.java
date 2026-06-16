package sec14.ClasseAbstrata;

abstract class InstrumentoMusical {
    
    protected String nome;
    
    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

 
    /**
     * Método abstrato - só tem a assinatura do método, tendo que ser
     * implementado na subclasse.
     */
    public abstract void tocar();


    /**
     * Método concreto - Pode ser herdado pela subclasse
     */
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
}
