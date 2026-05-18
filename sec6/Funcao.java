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

        // Testando System.exit()
        verificarAutenticacao("teste", "testando");
        System.out.println("Se entrar no exit, essa mensagem não aparecerá");
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


    // =========================================================
    // System.exit
    // =========================================================

    /**
     * Encerra imediatamente a execução do programa, finalizando todas as
     * operações em andamento. Logo deve ser usado com cuidado, normalmente
     * em casos de erro crítico ou quando não há mais nada a ser feito.
     * 
     * Casos de Uso: Tratamento de Erro, em cenários onde o programa não
     * deve continuar devido a um erro crítico. Interrupção controlada: Quando
     * o programa atinge um estado em que deve ser encerrado imediatamente, como
     * após a saída do usuário.
     * 
     * Sintaxe: System.exit(int status)
     * O argumento <int status> indica o estado do término do programa, sendo o 0
     * normalmente o indicativo de saída bem sucedida, e valores diferentes de 0 algum erro.
     */

    public static void verificarAutenticacao(String usuario, String senha) {
        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.out.println("Autenticação Falhou");
            System.exit(1);
        }
        System.out.println("Autenticação bem sucedida");
    }
}
