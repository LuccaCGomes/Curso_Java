package sec7;

import java.util.Scanner;

public class ConversorTemperatura {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite sua Escolha:\n1) Conversão °C -> °F\n2) Conversão °F -> °C");
      int opcao = scanner.nextInt();

      switch (opcao) {
         case 1:
            System.out.println("Insira a temperatura a ser convertida: ");
            double tempCelsius = scanner.nextDouble();
            celsiusParaFahrenheit(tempCelsius);
            break;
         case 2:
            System.out.println("Insira a temperatura a ser convertida: ");
            double tempFahrenheit = scanner.nextDouble();
            fahrenheitParaCelsius(tempFahrenheit);
            break;
         default:
            System.out.println("Opção Inválida");
            break;
      }

      scanner.close();
   }

   public static void celsiusParaFahrenheit(double celsius) {
      double conversaoFahrenheit = (celsius * 9/5) + 32;
      System.out.println("De " + celsius + "° C para " + conversaoFahrenheit + "° F");
   }

   public static void fahrenheitParaCelsius(double fahrenheit) {
      double conversaoCelsius = (fahrenheit -32) * 5/9;
      System.out.println("De " + fahrenheit + "° F para " + conversaoCelsius + "° C");
   }
}

