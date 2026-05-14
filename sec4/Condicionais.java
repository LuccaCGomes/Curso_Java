package sec4;

/**
 * Estruturas condicionais, são as estruturas que permitem controlar o
 * fluxo de execução do programa com base em condições lógicas
 */

public class Condicionais {

    public static void main(String[] args) {
    
    // =========================================================
    // If, Else If, Else
    // =========================================================

    /**
     * if: Executa um bloco de código caso a codição seja verdadeira.
     * Somente pode haver 1 if por estrutura de condição
     * 
     * else if: Verifica outra condição se as anteriores forem falsas,
     * e executa um bloco de código caso a condição seja verdadeira.
     * Podem ter quantos if else forem necessários por estrutura de condição
     * 
     * else: Executa um bloco de código alternativo caso todas as outras
     * condições anteriores sejam falsas. Somente pode haver 1 else por 
     * estrutura de condição. Todo else precisa ter um if, mas nem todo
     * if precisa ter um else.
     */

        // if
        int numero = 10;
        if (numero > 5) {
            System.out.println("O número " + numero + " é maior que 5");
        }


        //else
        int numero2 = 20;
        if (numero2 < 20) {
            System.out.println("O número " + numero2 + " é menor que 20");
        } else {
            System.out.println("O número " + numero2 + " é maior ou igual a 20");
        }

        //else if
        int numero3 = 5;
        if (numero3 < 5) {
            System.out.println("O número " + numero3 + " é menor que 5");
        } else if (numero3 == 5) {
            System.out.println("O número " + numero3 + " é igual a 5");
        } else {
            System.out.println("O número " + numero2 + " é maior que 5");
        }



    // =========================================================
    // switch Case
    // =========================================================

    /**
     * switch: Permite escolher entre várias opçõescom base no valor 
     * de uma expressão
     * 
     * Case: Define uma opção ou caminho dentro do switch.
     * 
     * Break: Utilizado para encerrar a execução de um bloco case. 
     * Ao contrário do if, que ao entrar em uma das condições, a estrutura
     * terminava, caso não tenha break (ou outro comando de desvio) no switch case,
     * após entrar em um dos casos, ele entrará nos casos seguintes.
     * 
     * Os valores em case devem ser exclusivos e correspondentes ao tipo
     * de expressão do switch
     * 
     */
    
        int diaDaSemana = 8;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;       
        }


    // Switch Case com Default

    /**
     * Default: O default atua como o else na estrutura if: É executado
     * quando nenhum dos valores especificados nos case corresponde à
     * expressão do switch. 
     * - O seu uso é opcional, mas recomendado para capturar
     * todos os casos não previstos. 
     * - Normalmente é colocado no final do switch, mas pode ficar em 
     * qualquer lugar do bloco. Caso coloque o defalt como último 
     * (que é a convenção), não é necessário colocar o break. 
     */
    
        int num = 12;

        switch (num) {
            case 10:
                System.out.println("O número é 10");
                break;
            case 20:
                System.out.println("O número é 20");
                break;
            default:
                System.out.println("O número não é 10 nem 20");
                break;
        }


    // Switch sem Break

    /**
     * - Sem o Break, o switch continua executando os blocos
     * subsequentes(fall-through), mesmo que o caso correspondente
     * já tenha sido encontrado, podendo levar à execução de múltiplos
     * casos e a resultados inexperados.
     * 
     * - Por isso é muito recomendado a utilização de break ao final de cada
     * case
     * 
     * - O fall-through, pode ser usado intencionalmente, mas os casos onde
     * sua utilização se aplica são raros, e depor isso deve ser feito com muito
     * cuidado e deve ser bem documentado para evitar erros no entendimento do
     * fluxo do código.
     */

        int valor = 1;

        switch (valor) {
            case 1:
                System.out.println("executou 1");
            case 2:
                System.out.println("executou 2");
            case 3:
                System.out.println("executou 3");
            case 4:
                System.out.println("executou 4");
            default:
                System.out.println("executou Default");
        }
    }

}
