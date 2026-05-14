package sec6;

public class Funcao {
    /**
     * A função é um bloco de código que realiza uma função específica 
     * e pode ser reutilizado (evitando reescrever a mesma lógica)
     * 
     * Divide o código em partes menores, tronando-o mais organizado
     * e fácil de manter
     * 
     * Parâmetreos e Retorno: Pode receber dados de entrada(parâmetros) e
     * pode ou não retornar um resultado após sua execução
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


    

    public static void main(String[] args) {
        saudacao();
    }

    // SINTAXE: <Nível de Acesso> <static> <Tipo de Retorno> <nome da função(camelCase)> (<tipo do parametro> <nome do parâmentro>) {Bloco de código}
    // Os conceitos de niveis de acesso e static ainda não vi e serão abordados mais a frente no curso
    public static void saudacao () {
        System.out.println("Olá esta é a primeira Função");
    }


}
