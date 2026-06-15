package sec14.Heranca;

public class Heranca {
    
    /**
     * Um dos pilares de POO
     * 
     * Permite que uma classe herde atributos e métodos 
     * de outra classe.
     * 
     * Cria uma relação entre as classe, onde a subclasse (classe filha)
     * é um tipo especializado da superclasse (classe pai).
     * 
     * Herança promove o reuso de código, facilitando a criação
     * de novas classes sem duplicação de lógica.
     */

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Bili");

        cachorro.emitirSom();
        cachorro.latir();
    }

}
