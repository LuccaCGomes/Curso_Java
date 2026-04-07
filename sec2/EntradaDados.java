import java.util.Scanner;

public class EntradaDados {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu país: ");
        scanner.nextLine(); // [1]
        String pais = scanner.nextLine();
        /*
            É necessária a utilização de um nextLine extra[1], pois após um nextInt, nextFloat, etc; se precisar capturar
            outra string utilizando o nextLine, ele irá capturar o enter do comando anterior e escapará sem receber o dado;
        */

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nPaís: " + pais);
        scanner.close();
    }
}
