package sec4;

import java.util.Scanner;

public class ExerciciosSec4 {
    
    public static void main(String[] args) {
        
        // Exercício 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");
        double preco = scanner.nextDouble();

        if (preco < 50) {
            System.out.println("Categoria de preço: Barato");
        } else if (preco <= 100) {
            System.out.println("Categoria de preço: Médio");
        } else {
            System.out.println("Categoria de preço: Caro");
        }

        


        // Exercicio 2

        System.out.println("Usuário: ");
        String usuario = scanner.next();
        System.out.println("Senha: ");
        String senha = scanner.next();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso Permitido!");
        } else{
            System.out.println("Acesso Negado!");
        }



        //Exercicio 3

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();
        String resposta = "";
        if(numero % 2 == 0){
            resposta = "Par";
        } else {
            resposta = "Ímpar";          
        }
        System.out.println("O número " + numero + " é " + resposta + "!");



        // Exercicio 4

        System.out.println("Insira um número de 1 a 7 (Referente ao dia da semana): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia útil");
                break;
            
            default:
            System.out.println("Dia inválido");
            break;
        }



        // Exercicio 5

        System.out.println("Insira um número: ");
        int num = scanner.nextInt();
        
        if (num >= 10 && num <=20) {
            System.out.println("Dentro do intervalo!");
        } else {
            System.out.println("Fora do Intervalo!");
        }



        //  Exercicio 6

        System.out.println("Insira uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");    
                break;
            default:
                System.out.println("Consoante");
                break;
        }

        scanner.close();
    }
}
