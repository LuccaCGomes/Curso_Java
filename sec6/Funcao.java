package sec6;

public class Funcao {
    /**
     * A função é um bloco de código que realiza uma função específica 
     * e pode ser reutilizado (evitando reescrever a mesma lógica)
     * 
     * Divide o código em partes menores, tronando-o mais organizado
     * e fácil de manter
     * 
     * Parâmetreos: Podem receber nenhum ou vários dados de entrada(parâmetros).
     * 
     * Retorno: A função pode ou não ter retorno. É uma instrução que ao ser executada,
     * encerra a execução da função e, opcionalmente, devolve um valor ao ponto onde a função
     * foi chamada. Pode retornar valores de qualquer tipo: Primitivos, objetos ou nada (void).
     * 
     * Importante se atentar ao escopo das variáveis, porque as variáveis que
     * forem declaradas dentro da função são locais e não afetam o restante do programa
     * 
     * 
     * NORMALMENTE a função é definida com um tipo de retorno, um nome e pode 
     * ou não receber parâmetros
     * Mas ela pode ser também criada sem parâmetros e sem retorno, em caso que
     * não requerem entrada e saída.
     */


    
    // =========================================================
    // Função Main
    // =========================================================

    /**
     * Para que um programa Java seja executado é necessário que exista uma função
     * main. Ela é o ponto de entrada do programa, onde a execução começa.
     * 
     * A função main pode chamar outras funções e métodos dentro do programa.
     * 
     * Deve ter a assinatura exata: public static void main(String[] args).
     *
     */

    public static void main(String[] args) {
        saudacao();
        soma(2, 3);
        double massaCorporal = imc(100, 1.80);
        System.out.println("IMC: " + massaCorporal);
    }


    // =========================================================
    // Exemplos de Função
    // =========================================================

    // SINTAXE: <Nível de Acesso> <static> <Tipo de Retorno> <nome da função(camelCase)> (<tipo do parametro> <nome do parâmentro>) {Bloco de código}
    // Os conceitos de niveis de acesso e static ainda não vi e serão abordados mais a frente no curso

    // Função sem parâmentros e sem retornos
    public static void saudacao () {
        System.out.println("Olá esta é a primeira Função");
    }

    //Função com parâmetros e sem retornos
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("Soma de " + a + " + " + b + " = " + resultado);
    }

    //Função com parâmentro e com retorno
    public static double imc(double peso, double altura) {
        double indice = peso / (altura * altura);
        return indice;
    }
}
