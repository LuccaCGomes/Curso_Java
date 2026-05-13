package sec4;

/**
 * Estruturas condicionais, são as estruturas que permitem controlar o
 * fluxo de execução do programa com base em condições lógicas
 */

public class Condicionais {

    public static void main(String[] args) {
    
    // =========================================================
    // If, Else If, Else
    // =========================================================

    /**
     * if: Executa um bloco de código caso a codição seja verdadeira.
     * Somente pode haver 1 if por estrutura de condição
     * 
     * else if: Verifica outra condição se as anteriores forem falsas,
     * e executa um bloco de código caso a condição seja verdadeira.
     * Podem ter quantos if else forem necessários por estrutura de condição
     * 
     * else: Executa um bloco de código alternativo caso todas as outras
     * condições anteriores sejam falsas. Somente pode haver 1 else por 
     * estrutura de condição. Todo else precisa ter um if, mas nem todo
     * if precisa ter um else.
     */

        // if
        int numero = 10;
        if (numero > 5) {
            System.out.println("O número " + numero + " é maior que 5");
        }


        //else
        int numero2 = 20;
        if (numero2 < 20) {
            System.out.println("O número " + numero2 + " é menor que 20");
        } else {
            System.out.println("O número " + numero2 + " é maior ou igual a 20");
        }

        //else if
        int numero3 = 5;
        if (numero3 < 5) {
            System.out.println("O número " + numero3 + " é menor que 5");
        } else if (numero3 == 5) {
            System.out.println("O número " + numero3 + " é igual a 5");
        } else {
            System.out.println("O número " + numero2 + " é maior que 5");
        }



    // =========================================================
    // switch Case
    // =========================================================

    /**
     * switch: Seleciona e executa um bloco de código entre várias 
     * opções com base no valor de uma expressão.
     */
    }

}
