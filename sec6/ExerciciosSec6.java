package sec6;

public class ExerciciosSec6 {
    public static void main(String[] args) {
        
        //COnversão de Celsius para Fahrenheit
        double temperaturaFahrenheit = CelsiusParaFahrenheit(32);
        System.out.println(temperaturaFahrenheit);

        // Calculando Fatorial
        int resultadoFatorial = Fatorial(5);
        System.out.println(resultadoFatorial);

        // Verificar paridade do número
        String paridadeDoNumero = VerificaParidade(4);
        System.out.println(paridadeDoNumero);
        String paridadeDoNumero2 = VerificaParidade(5);
        System.out.println(paridadeDoNumero2);

        //Classifica Nota por Letra
        String notaClassificada = ClassificaNota(1);
        System.out.println(notaClassificada);


        // Verifica idade e encerra programa se menor que 18 anos
        VerificaIdade(19);


        // Retorna maior número de um dado Array de Inteiros
        int[] arrayNumeros = {-7, -2, 0, -3, -9};
        int numeroMaior = RetornaMaiorNumero(arrayNumeros);
        System.out.println(numeroMaior);



    }

    // Exercício 1
    public static double CelsiusParaFahrenheit(double temperatura) {
        return (temperatura * 1.8) + 32;
    }

    // Exercício 2
    public static int Fatorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * Fatorial(num -1);
    }

    // Exercício 3
    public static String VerificaParidade(int num) {
        if(num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    // Exercício 4 
    public static String ClassificaNota(int nota) {

        if(nota < 0 || nota > 10) {
            return "Nota Inválida";
        }
        
        switch (nota) {
            case 10:    
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    // Exercicio 5
    public static void VerificaIdade(int idade) {
        if (idade < 18) {
            System.out.println("Acesso Negado!");
            System.exit(1);
        } else {
            System.out.println("Acesso Permitido!");
        }
    }

    // Exercicio 6 (Desafio)
    public static int RetornaMaiorNumero(int[] numeros) {

        int tamanhoArray = numeros.length;
        if(tamanhoArray <= 0){
            System.out.println("Array Vazio");
            System.exit(2);
        }

        int maiorNúmero = numeros[0];
        for(int i = 1; i < tamanhoArray; i++) {
            if(numeros[i] > maiorNúmero) {
                maiorNúmero = numeros[i];
            }
        }

        return maiorNúmero;

    }
}
