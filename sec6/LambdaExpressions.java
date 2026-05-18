package sec6;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    
    public static void main(String[] args) {
        
        // =========================================================
        // Funções Anônimas (Lambda Expressions)
        // =========================================================

        /**
         * 
         * Lambdas são funções anônimas, ou seja, funções sem nome,
         * que podem ser usadas para expressar brevemente pequenas operações
         * ou blocos de código, especialmente em programação funcional.
         * 
         * Foram introduzidas no Java 8
         * 
         * FORMATO: (parâmetros) -> {corpo da função}
         * Se a expressão for simples, o corpo da função pode ser uma única
         * linha sem os {}.
         * 
         * Suas vantagens são que permitem escrever um código mais conciso e legível,
         * e são amplamente utilizadas em conjunto com Streams e interfaces funcionais
         * como Runnable e Comparator
         * 
         */



        Runnable tarefa = () -> System.out.println("Minha função Anônima");
        tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Beto", "Carla");
        nomes.forEach(nome -> System.out.println(nome));
        
    }
}
