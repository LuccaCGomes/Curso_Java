package sec8;

public class EstruturasDeRepeticao {
    
    /**
     * 
     * Estruturas de Repetição (Loops), são comandos que permitem
     * a execução repetida de um bloco de código enquanto uma condição
     * for verdadeira.
     * 
     * As estruturas mais utilizadas são:
     * 
     * - For: Ideal para quando sabemos o número de repetições a serem realizadas
     * - While: Executa bloco de código enquanto uma condição for verdadeira
     * - Do-while: Similar ao while, mas garante que o bloco de código seja
     *             executado ao menos uma vez.
     * 
     */
    public static void main(String[] args) {

        // =========================================================
        // For
        // =========================================================

        /**
         * O for é uma estrutura de repetição que permite executar um bloco de
         * código um número determinado de vezes
         * 
         * Seu cabeçalho consiste de 3 partes:
         * - Inicialização
         * - Condição
         * - Incremento
         * 
         * Sintaxe: for(inicialização; condição; incremento) {Bloco de código}
         */

        for(int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }

        String palavra = "Paralelepipedo";

        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }

        for(int i = 10; i >= 0; i--) {
            System.out.println("Contagem Regressiva: " + i);
        }


        // =========================================================
        // While
        // =========================================================

        /**
         * O while executará um bloco de código repetidamente eunquanto
         * uma condição específica for verdadeira.
         * 
         * Sintaxe: while(condição) {Bloco de código}
         */

        int l = 0;
        while(l <= 5) {
            System.out.println("Contador while: " + l);
            l++;
        }

        int valor = 0;
        while(valor != 7) {
            valor = (int)(Math.random() * 10);
            System.out.println("Valor aleatório: " + valor);
        }


        // =========================================================
        // Do-While
        // =========================================================

        /**
         * O do-while garante que o bloco de código seja executado pelo menos
         * 1 vez, verificando a condição após a execução.
         * 
         * Sintaxe: do {Bloco de código} while (Condição);
         */


        int j = 10;
        do {
            System.out.println(" Valor de J: " + j);
            j--;
        } while (j > 0);


        int k = 5;
        do {
            System.out.println("Valor de K: " + k);
        } while (k < 5);

        
        // =========================================================
        // Instruções de interrupção de loop: Break & Continue
        // =========================================================


        /**
         * Break: Instrução utilizada para interromper um loop imediatamente,
         * mesmo que a condição de termino original não tenha sido atingida.
         * Termina o loop atual e continua a execução do código dps do loop.
         * Pode ser utilizado com qualquer estrutura de repetição.
         */

        for(int i = 0; i < 10; i++){
            if(i == 7){
                System.out.println("Break");
                break;
            }
            System.out.println("contador break: " + i);
        }
        System.out.println("Código após o loop do break");


        /**
         * Continue: É uma instrução que interrompe a iteração ATUAL do
         * loop e pula para a próxima iteração(sem interromper o loop completo), 
         * ignorando o restante do código dentro do bloco do loop para aquela iteração.
         */

        for(int i = 0; i < 10; i++){
            if(i == 7){
                System.out.println("Continue");
                continue;
            }
            System.out.println("contador: " + i);
        }
        System.out.println("Código após o loop do break");
    }
}
