package sec14.Heranca.PalavraChaveSuper;

public class Gerente extends Funcionario{
    /**
     * SUPER
     * 
     * é uma palavra-chave em java usada para referenciar a superclasse de uma
     * subclasse.
     * 
     * Através de super, uma subclasse pode:
     *  . Chamar o construtor da superclasse; 
     *  . Acessar métodos e atributos da superclasse que foram sobrescritos na
     *    subclasse;
     * O uso de super é comum quando a subclasse deseja reutilizar parte do comportamento
     * da superclasse.
     */

    private double bonusAdicional;

    public Gerente(String nome, double salario, double bonusAdicional) {
        super(nome, salario); // chamou construtor da superclasse
        this.bonusAdicional = bonusAdicional;
    }

    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // chamou execução do método da superclasse
        System.out.println("Bonus Adicional: " + bonusAdicional);
    }
    
    @Override
    public double calcularBonus() {
        return super.calcularBonus() + bonusAdicional;
    }


}
