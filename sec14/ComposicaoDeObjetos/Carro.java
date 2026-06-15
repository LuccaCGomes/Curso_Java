package sec14.ComposicaoDeObjetos;

public class Carro {
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

    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirInfo() {
        System.out.println("\nMarca: " + marca + "\nModelo: " + modelo);
        motor.exibirInfo();
    }
}
