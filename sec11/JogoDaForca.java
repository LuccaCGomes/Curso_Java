package sec11;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a palavra secreta: ");
        char[] palavraSecreta = (scanner.nextLine()).toUpperCase().toCharArray();

        System.out.println("Insira a quantidade de chances: ");
        int tentativas = scanner.nextInt();

        char[] palavraOculta = new char[palavraSecreta.length];
        Arrays.fill(palavraOculta, '_');
        
        while(tentativas > 0) {
            boolean contemLetra = false;

            System.out.println("Palpite de letra: ");
            char palpite = Character.toUpperCase(scanner.next().charAt(0));

            for (int i = 0; i < palavraSecreta.length; i++) {
                if (palavraSecreta[i] == palpite) {
                    contemLetra = true;
                    palavraOculta[i] = palavraSecreta[i];
                }
            }
            if (contemLetra) {
                System.out.println("Letra " + palpite + " Existe na palavra");
                System.out.println("Palavra: " + String.valueOf(palavraOculta));
            } else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println("Suas tentativas acabaram!");
                    System.out.println("A palavra era: " + String.valueOf(palavraSecreta));
                    break;
                }
                System.out.println("Letra não existe na palavra\nTentativas restantes: " + tentativas);
                System.out.println("Palavra: " + String.valueOf(palavraOculta));
            }

            if (String.valueOf(palavraOculta).equals(String.valueOf(palavraSecreta))) {
                System.out.println("Você descobriu a palavra oculta!");
                break;
            }
        }
        scanner.close();
    }
}
