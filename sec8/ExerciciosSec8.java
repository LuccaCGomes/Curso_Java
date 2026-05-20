package sec8;

import java.util.Scanner;

public class ExerciciosSec8 {
    
    public static void main(String[] args) {
        
        // Exercicio 1: Somatório com for  
        somatorioFor();
        
        // Exercício 2: Impressão de numeros pares com while
        ImprimeNumerosPares();

        // Exercício 3: Verificação de Número Primo com For
        VerificaSeEhPrimo();

        // Exercício 4: Menu Interativo usando Do-While
        MenuInterativo();

        // Exercício 5: Fatorial de um número com For
        CalculaFatorial();

        // Exercício 6: Contagem de dígitos de um número com while
        QuantidadeDeDigitosEmInteiro();

    }


    // Ex 1
    public static void somatorioFor() {
        Scanner scannerSomatorio = new Scanner(System.in);

        System.out.println("Indique o número final do somatório: ");
        int numero = scannerSomatorio.nextInt();

        int somatorio = 0;
        for(int i = 1; i <= numero; i++) {
            somatorio += i;
        }
        System.out.println("Somatório de 1 até " + numero + " = " + somatorio);

        scannerSomatorio.close();
    }


    // Ex 2
    public static void ImprimeNumerosPares() {
        Scanner scannerPares = new Scanner(System.in);

        System.out.println("Indique um número maior que 1: ");
        int numero = scannerPares.nextInt();

        int j = 1;
        System.out.print("Números pares entre 1 e " + numero + ": ");
        while(j <= numero) {
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        scannerPares.close();
    }


    // Ex 3
    public static void VerificaSeEhPrimo() {
        Scanner scannerPrimos = new Scanner(System.in);

        System.out.println("Indique um número para verificar se é primo: ");
        int numero = scannerPrimos.nextInt();

        int contador = 0;
        for(int i = 1; i <= numero; i++) {
            if(numero % i == 0) {
                contador++;
            }
        }
        if(contador == 2){
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " NÃO é primo");
        }

        scannerPrimos.close();
    }

    // Ex 4
    public static void MenuInterativo() {
        Scanner scannerMenu = new Scanner(System.in);

        int escolha;

        do {
        
            System.out.println("Menu");
            System.out.println("1) Hamburger");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            escolha = scannerMenu.nextInt();

            System.out.println("A opção escolhida foi: " + escolha);
            
        } while (escolha != 4);

        scannerMenu.close();
    }

    // Ex 5
    public static void CalculaFatorial() {
        Scanner scannerFatorial = new Scanner(System.in);

        System.out.println("Indique o número do Fatorial: ");
        int numero = scannerFatorial.nextInt();

        if(numero == 0) {
            System.out.println("0! = 1");
        } else if (numero < 0) {
            System.out.println("O fatorial somente se aplica aos número naturais");
        } else {
            int fatorial = 1;
            for(int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }

        scannerFatorial.close();
    }

    // Ex 6
    public static void QuantidadeDeDigitosEmInteiro() {
        Scanner scannerQtdDigitos = new Scanner(System.in);

        System.out.println("Indique o número Inteiro: ");
        int numero = scannerQtdDigitos.nextInt();

        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println(contador + " dígitos");

        scannerQtdDigitos.close();
    }
    
}
