package sec14.Overriding;

public class Forma {

    /**
     * OVERRIDING
     * 
     * Recurso de POO que permite a uma subclasse fornecer uma implementação
     * específica para um método que já está definido na superclasse.
     * 
     * O método sobrescrito na subclasse deve ter a mesma assinatura(mesmo nome e parâmetros)
     * que o método da superclasse e utilizar a palavra-chave @Override para indicar que o método
     * está sendo sobrescrito.
     * 
     *  O Overriding permite que a subclasse modifique ou especialize o comportamento herdado
     * de uma superclasse.
     */
    
    public double calcularArea() {
        System.out.println("Calculando Área...");
        return 0;
    }

    // As classes quadrado e circulo(subclasses de forma) fizeram o override e implementaram de forma diferente o calcular área
}
