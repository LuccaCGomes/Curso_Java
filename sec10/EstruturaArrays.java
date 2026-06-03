package sec10;

import java.util.ArrayList;
import java.util.Arrays;

public class EstruturaArrays {
    
    public static void main(String[] args) {
        /**
         * São estruturas de dados que armazenam multiplos valores do MESMO TIPO
         * 
         * Podem armazenar tanto tipos primitivos como objetos
         */

        // =========================================================
        // Sintaxe e Inicialização
        // =========================================================

        /**
         * Os arrays podem ser inicializados com valores específicos no momento da
         * declaração ou instanciados com um tamanho fixo (nesse caso o array começa vazio)
         */

        // Inicializado com valores específicos
        // Sintaxe: tipo[] nomeArray = {valores};
        double[] doubles = {12.3, 1.2, 2, 4.5};


        // Instanciado com tamanho fixo
        // Sintaxe: tipo[] nomeArray = new tipo[tamanho];
        int[] inteiros = new int[3];


        // =========================================================
        // Atribuindo valores
        // =========================================================

        inteiros[0] = 26;
        inteiros[1] = -1;
        inteiros[2] = 4;

        // Podemos também modificar o valor já existente de um campo do array

        System.out.println("Valor do array doubles na posição 0 antes da mudança: " + doubles[0]);

        doubles[0] = 6.36;
        System.out.println("Valor do array doubles na posição 0 depois da mudança: " + doubles[0]);


        // =========================================================
        // iterando com for each
        // =========================================================

        /**
         * O for each permite iterar sobre um array de forma simplificada, sem precisar
         * gerenciar índices.
         * 
         * Ele é ideal para quando querermos percorrer todos os elementos de um array
         * quando não é necessário modificar o índice ou acessar elementos fora da
         * sequência.
         */


        // Sintaxe: for(tipo variável : array) {Bloco de código}
        for(int inteiro : inteiros) {
            System.out.println("O número é: " + inteiro);
        }

        // Exemplo: Concatenar elementos de um array
        String[] palavras = {"Java", "é", "bom!"};
        String frase = "";

        for(String palavra : palavras){
            frase += palavra + " ";
        }
        System.out.println(frase);

        // Exemplo: Veriicar se valor está presente em array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        char letraProcurada = 'o';

        for(char letra : letras) {
            if (letra == letraProcurada) {
                System.out.println("A letra " + letra + " existe no array");
                break;
            }
        }

        /**
         * FOR X FOR EACH
         * 
         * Basicamente, quando eu precisar acessar ou manipular o indice do array,
         * seja para pular elementos ou modificar diretamente os elementos do array,
         * é recomendado utilizar o FOR.
         * Caso queira percorrer um array ou coleção SEM a necessidade de modificar os
         * elementos ou controlar índice, o mais interessante é o FOR EACH.
         */


        // =========================================================
        // Método toString do array
        // =========================================================

        /**
         * Utilizado para converter um array em uma representação em string,
         * permitindo a exibição direta do conteúdo do array. Facilitando a visualização
         * dos elementos de um array em uma única linha.
         * 
         * Embora não seja muito usado em produção, ele é útil para debugs e saída de dados .
         */

        String dadosNumericos = Arrays.toString(inteiros);
        System.out.println(dadosNumericos);

        System.out.println(Arrays.toString(palavras));


        // =========================================================
        // Adicionar mais elementos ao Array
        // =========================================================

        /**
         * A estrutura de dados Array ela por definição tem tamanho fixo, então
         * uma vez inicializado, não pode ser aumentado nem diminuído. Caso seja necessário
         * adicionar mais elementos os métodos comuns seriam: criar um novo array OU usar
         * outra estrutura como o ArrayList(collection).
         */

        /**
         * MÉTODO 1 - Criando um novo array maior e copiando os elementos
         */

        int[] novoInteiros = new int[inteiros.length + 1]; // assim estaríamos criando um array com 1 elemento a mais que o antigo
        for (int i = 0; i < inteiros.length; i++) {
            novoInteiros[i] = inteiros[i]; // com isso teremos os mesmo valores nos mesmo indices, e o ultimo indice estaria livre para mais um valor
        }

        novoInteiros[novoInteiros.length -1] = 13; // Agora posso adicionar mais 1 elemento no array
        System.out.println(Arrays.toString(novoInteiros)); // Agora vemos que o novo array tem 4 elementos

        // Podemos também utilizar o arraycopy para copiar os elementos sem precisar iterr sobre o 
        
        double[] novoDoubles = new double[doubles.length + 1];
        System.arraycopy(doubles, 0, novoDoubles, 0, doubles.length);// (Array a ser copiado, indice de começo, array onde colar a copia, indice de inicio, quantos elementos copiar);

        novoDoubles[novoDoubles.length - 1] = 98.76;
        System.out.println(Arrays.toString(novoDoubles));


        /**
         * MÉTODO 2 - Usando ArrayList
         */

        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja"));
        System.out.println(listaFrutas); // Com o ArrayList, não preciso mais usar toString

        listaFrutas.add("Cacau"); // A estrutura ArrayList tem métodos mara o manipular, logo não precisamos nos preocupar com tamanho, pois o java lida com isso.
        System.out.println(listaFrutas);

        listaFrutas.add("Morango");
        System.out.println(listaFrutas);


        // =========================================================
        // Reference Trap
        // =========================================================


        int[] arrayOriginal = {1, 2, 3};
        
        //Bloco de código ...

        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 11;
        System.out.println(Arrays.toString(arrayOriginal)); // [11, 2, 3]

        /**
         * Vemos que o array original também mudou seu valor, isso aconteceu pois a forma
         * como fizemos fez ambas as variáveis que representam o array apontar para os
         * mesmos valores na memória.
         * 
         * Caso queiramos copiar um Array para outra variável e que as modificações de um
         * não interfiram no outro, devemos fazer através do clone().
         */

        int[] arrayClone = arrayOriginal.clone();
        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal)); // [11, 2, 3]
        System.out.println(Arrays.toString(arrayClone)); // [999, 2, 3]

        // Agora podemos ver que a modificação no array clone não modificou o array original


        // =========================================================
        // Matrizes (Arrays 2D)
        // =========================================================


        // Inicializando a Matriz já com os valores
        int[][] matrizInteiros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrizInteiros[0][2]); // 3


        // Criando Matriz vazia e preenchendo
        int[][] tabelaInteiros = new int[3][3];
        
        tabelaInteiros[0][0] = 10;
        tabelaInteiros[1][1] = 20;
        tabelaInteiros[2][2] = 30;

        for(int[] linha : tabelaInteiros){
            System.out.println(Arrays.toString(linha));
            /*
                [10, 0, 0]
                [0, 20, 0]
                [0, 0, 30]
             */
        }



        int[][] grade = new int[3][6];

        for (int m = 0; m < grade.length; m++) {
            for(int n = 0; n < grade[0].length; n++) {
                grade[m][n] = (m+1) * (n+3);
            }
        }


        for(int[] line : grade) {
            System.out.println(Arrays.toString(line));
            /*
                [3, 4, 5, 6, 7, 8]
                [6, 8, 10, 12, 14, 16]
                [9, 12, 15, 18, 21, 24]
            */
        }
        
    }
}
