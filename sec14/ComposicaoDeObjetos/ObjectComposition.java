package sec14.ComposicaoDeObjetos;

public class ObjectComposition {
    
    /**
     * Princípio de POO onde um objeto é composto por outros objetos.
     * 
     * Na composição, um objeto maior contém outros objetos menores como
     * atributos, combinando suas funcionalidades para formar comportamentos
     * mais complexos.
     * 
     * A composição oferece uma alternativa à herança, favorecendo a reutilização
     * de código sem criar dependências rígidas entre classes.
     */

    public static void main(String[] args) {
        
        Motor motor = new Motor("V8", 510);

        Carro carro = new Carro("Ford", "Mustang", motor);

        carro.exibirInfo();

    }
}
