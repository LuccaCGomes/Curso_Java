package sec12;

public class Pessoa {


    // ==============================================
    // MODIFICADORES DE ACESSO
    // ==============================================

    /**
     * Controlam a visibilidade dos membros de uma classe (Atributos e Métodos).
     * 
     * - public: O membro pode ser acessado de qualquer lugar(dentro e fora do pacote)
     * - private: O membro só pode ser acessado dentro da própria classe
     * - Protected: O membro só pode ser acessado dentro da classe, suas subclasses e
     *              classes do mesmo pacote
     * 
     * O uso dos modificadores de acesso são FUNDAMENTAIS para aplicar o encapsulamento,
     * eles protegem os dados e métodos, garantindo o controle de como eles são
     * acessados e modificados.
     */
    
    private String nome;
    private int idade;


    // ==============================================
    // SETTERS E GETTERS
    // ==============================================

    /**
     * SETTER
     * 
     * São métodos utilizados para alterar os valores das propriedades
     * Privadas de uma classe, permitindo o controle sobre como os atributos
     * de um objeto são modificados.
     * 
     * Com os setters, podemos garantir que os valores dos atributos sejam válidos
     * antes dde serem atribuidos. Podemos adicionar lógica de validação ou
     * manipulação dos dados antes de atualizar o valor
     */

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome Inválido");
        }
        
    }

    public void setIdade(int idade) {
        
        if (idade < 0) {
            System.out.println("Idade Inválida");
        } else {
            this.idade = idade;
        }

        /**
         * THIS
         * 
         * O this é uma palavra-chave usada dentro de métodos de uma
         * classe para se referir ao Objeto atual.
         * 
         * Ele é útil para distiguir entre os atributos do objeto e os
         * parâmetros do método com o mesmo nome.
         * 
         * > this.idade = idade  ----> (atributo idade do Objeto) = (parâmetro idade do método)
         */
    }

    /**
     * GETTER
     * 
     * São métodos usados para acessar os valores das propriedades
     * privadas de uma classe, permitindo que outras classes ou métodos
     * leiam os atributos, mas sem permitir modifica-los diretamente.
     */
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
