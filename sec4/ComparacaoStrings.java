package sec4;

/*
 * Comparação de Strings em Java
 *
 * O resultado da comparação pode mudar dependendo:
 * 1) Da forma utilizada para comparar (== ou equals())
 * 2) Da forma como a String foi criada
 */

public class ComparacaoStrings {

    public static void main(String[] args) {

        // =========================================================
        // COMPARAÇÃO UTILIZANDO "=="
        // =========================================================

        /*
         * O operador "==" compara:
         *
         * - Valores -> quando usamos tipos primitivos
         * - Referências de memória -> quando usamos objetos
         *
         * Como String é uma classe (objeto), normalmente o "=="
         * compara referências na memória e NÃO o conteúdo da String.
         */


        // ---------------------------------------------------------
        // CASO 1) Comparação entre Strings literais
        // ---------------------------------------------------------

        /*
         * Strings literais utilizam o "String Pool".
         *
         * O Java reutiliza Strings com o mesmo conteúdo para economizar
         * memória. Assim, duas Strings literais iguais acabam apontando
         * para o mesmo endereço de memória.
         *
         * Nesse caso, "==" retorna true.
         */

        String texto1 = "Olá, mundo!";
        String texto2 = "Olá, mundo!";

        System.out.println(texto1 == texto2); // true


        // ---------------------------------------------------------
        // CASO 2) Comparação entre literal e objeto criado com new
        // ---------------------------------------------------------

        /*
         * Quando usamos "new String()", um novo objeto é criado na Heap.
         *
         * Mesmo que o conteúdo seja igual, o endereço de memória será
         * diferente da String literal.
         *
         * Por isso, "==" retorna false.
         */

        String varStr1 = "Lorem Ipsum";
        String varStr2 = new String("Lorem Ipsum");

        System.out.println(varStr1 == varStr2); // false

        System.out.println(varStr2 == "Lorem Ipsum"); // false


        // =========================================================
        // COMPARAÇÃO UTILIZANDO equals()
        // =========================================================

        /*
         * O método equals() compara o CONTEÚDO das Strings
         * e não a referência de memória.
         *
         * Por isso, ele é a forma mais segura e recomendada
         * para comparar Strings em Java.
         */

        System.out.println(varStr1.equals(varStr2)); // true


        // ---------------------------------------------------------
        // equalsIgnoreCase()
        // ---------------------------------------------------------

        /*
         * equalsIgnoreCase() funciona como o equals(),
         * mas ignora diferenças entre letras maiúsculas
         * e minúsculas.
         */

        String nome1 = "TEXTO";
        String nome2 = "texto";

        System.out.println(nome1.equals(nome2)); // false
        System.out.println(nome1.equalsIgnoreCase(nome2)); // true
    }
}