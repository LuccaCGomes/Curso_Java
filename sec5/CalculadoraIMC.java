package sec5;

import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Peso(kg)
        System.out.println("Insira seu peso(Kg): ");
        double peso = scanner.nextDouble();

        // Altura(m)
        System.out.println("Insira sua altura(m): ");
        double altura = scanner.nextDouble();

        // Calcula IMC
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do Peso: " + imc);
        } else if (imc <= 24.9) {
            System.out.println("Peso Normal: " + imc);
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso: " + imc);
        } else {
            System.out.println("Obesidade: " + imc);
        }
        
        scanner.close();
    }
}
