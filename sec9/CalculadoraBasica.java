package sec9;

import java.util.Scanner;

public class CalculadoraBasica {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecione a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + soma(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + subtrai(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplica(numero1, numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possivel a divisão por 0!");
                }  else {
                    System.out.println("Resultado: " + divide(numero1, numero2));
                }
                break;
            default:
                System.out.println("Operação Invállida!");
                break;
        }
        scanner.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrai(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplica(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
