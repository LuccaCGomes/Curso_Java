package sec6;

public class FuncoesBuiltIn {
    
    public static void main(String[] args) {
        
        // =========================================================
        // Funções Built-in
        // =========================================================
        
        /**
         *
         * São FUnções já incorporadas na Linguagem que fornecem funcionalidades
         * comuns e essenciais. Elas já vem prontas para uso e não precisam ser
         * definidas pelo programador.
         * 
         * Estão disponíveis automaticamente sem necessidade de importação ou definição,
         * servindo para manipulação de strings, operações matemáticas, conversão de
         * dados, entre outras funcionalidades.
         * 
         * Geralmente, essas funções são Altamente Otimizadas para desempenho.
         * 
         */


        // Exemplos de algumas funções Built-in de String

        String frase = "Olá, Mundo!";
        System.out.println(frase);

        System.out.println("length: " + frase.length()); // 11
        System.out.println("substring: " + frase.substring(0, 3)); //Olá
        System.out.println("toUpperCase: " + frase.toUpperCase()); // OLÁ, MUNDO!
        System.out.println("toLowerCase: " + frase.toLowerCase()); // olá, mundo!
        System.out.println("replace (o por u): " + frase.replace("o", "u")); //Olá, Mundu

        String fraseModificada = frase.toLowerCase();
        System.out.println(fraseModificada); // olá, mundo!


        // Exemplos de algumas funções Built-in Matemáticas

        int num1 = 10;
        int num2 = 5;
        double num3 = -2.5;
        
        System.out.println("sqrt: " + Math.sqrt(num1)); // 3.162277....
        System.out.println("pow: " + Math.pow(num1, num2)); // 100000.0
        System.out.println("abs: " + Math.abs(num3)); // 2.5
        System.out.println("max: " + Math.max(num1, num2)); // 10

    }
}
