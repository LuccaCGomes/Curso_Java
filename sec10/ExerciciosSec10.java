package sec10;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciciosSec10 {
    public static void main(String[] args) {

        // Exercício 1 - Inverter Elementos de um Array
        int[] arrayInteiros = {1, 3, 5, 7, 9};
        inverteArray(arrayInteiros);

        // Exercício 2 - Encontrar elemento mais frequente de um array
        int[] numeros = {4, 1, 9, 3, 7, 2, 8, 5, 6, 1, 9, 4, 2, 7, 3, 8, 5, 6, 1, 4};
        determinaModa(numeros);

        //Exercício 3 - Transpor uma Matriz
        int[][] matriz3x3 = {
            {4, 9, 1},
            {7, 3, 8},
            {2, 10, 5}
        };

        int[][] matriz2x5 = {
            {6, 1, 9, 4, 10},
            {3, 8, 5, 2, 7}
        };

        int[][] matriz4x2 = {
            {8, 2},
            {5, 10},
            {1, 7},
            {4, 9}
        };
        transpoeMatriz(matriz3x3);
        transpoeMatriz(matriz2x5);
        transpoeMatriz(matriz4x2);


        // Exercício 4 - Substituir elementos negatiovs do Array por 0
        int[] elementos = {-8, 3, -2, 7, -10, 5, -1, 9, -6, 4};
        retiraNegativos(elementos);

        // Exercícios 5 - Remover elementos duplicados de um array
        int[] numerosComDuplicata = {3, 8, 3, 10, 1, 8, 2, 9, 4, 6, 1, 8, 3, 5, 7};
        removeDuplicados(numerosComDuplicata);
    }



    // Ex 1
    public static void inverteArray(int[] array) {
        int[] arrayInvertido = array.clone();
        int inicio = 0;
        int fim = array.length -1;

        while(inicio < fim) {
            int valorTemp = arrayInvertido[inicio];
            arrayInvertido[inicio] = arrayInvertido[fim];
            arrayInvertido[fim] = valorTemp;
            inicio++;
            fim--;
        }

        System.out.println("Array Original: " + Arrays.toString(array));
        System.out.println("Array Invertido: " + Arrays.toString(arrayInvertido));

    }

    // Ex 2
    public static void determinaModa(int[] array) {
        int maisFrequente = array[0];
        int maxContagem = 0;

        for (int i = 0; i < array.length; i++) {
            int contagem = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    contagem++;
                }
            }

            if (contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = array[i];
            }
        }

        System.out.println("O mais frequente é: " + maisFrequente + " com " + maxContagem + " Recorrências");

    }

    //Ex3
    public static void transpoeMatriz(int[][] matriz) {
        int[][] matrizTransposta = new int [matriz[0].length][matriz.length];

        for(int m = 0; m < matrizTransposta.length; m++) {
            for (int n = 0; n < matrizTransposta[0].length; n++) {
                matrizTransposta[m][n] = matriz[n][m];
            }
        }

        System.out.println("Matriz Original: ");
        for (int[] linhaOriginal : matriz) {
            System.out.println(Arrays.toString(linhaOriginal));
        }

        System.out.println("Matriz Transposta: ");
        for (int[] linhaTransposta : matrizTransposta) {
            System.out.println(Arrays.toString(linhaTransposta));
        }
    }


    // Ex 4
    public static void retiraNegativos(int[] array) {
        System.out.println("Array Original: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        } 
        System.out.println("Array sem negativos: " + Arrays.toString(array));
    }

    // Ex 5
    public static void removeDuplicados(int[] array) {
        ArrayList<Integer> arraySemDuplicata = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!arraySemDuplicata.contains(array[i])) {
                arraySemDuplicata.add(array[i]);
            }
        }

        System.out.println("Array Original: " + Arrays.toString(array));
        System.out.println("Array sem Duplicata: " + arraySemDuplicata);
    }
}
 