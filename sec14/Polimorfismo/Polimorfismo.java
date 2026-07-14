package sec14.Polimorfismo;

public class Polimorfismo {
    /**
     * Um dos pilares da Orientação a Objetos, permite que uma
     * única interface ou tipo seja usada para diferentes tipos de objetos
     * 
     * Permite que um objeto de uma subclasse seja tratado como um objeto
     * de sua superclasse, e também que métodos da superclasse sejam sobrescritos
     * pelas subclasses
     * 
     * Existem 2 tipos de polimorfismo:
     *  1- Polimorfismo de sobrescrita(Override): Quandouma subclasse fornece sua própria implementação
     *     de um método herdado da superclasse
     *  2- Polimorfismo de Sobrecarga(Overload): Quando vários métodos tem o mesmo nome, mas com assinaturas
     *     diferentes.
     * 
     * Classes abstratas ou interfaces -> Sobrescrever os métodos destas superclasses
     */

    public static void main(String[] args) {
        Instrumento violino = new Violino("Stradivarius");

        violino.exibirDetalhes();
        violino.tocar();
    }

    
}
