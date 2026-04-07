public class Constantes {

    /**
     * - Uma constante é uma variável que não pode ter seu valor alterado após a sua inicialização.
     * - Uma vez atribuido um valor, não pode ser modificado
     * - No Java utilizamos a palavra <final> para criarmos uma constante.
     * - Por conveção no Java constantes são nomeadas em letras maiúsculas, com palavras separadas por sublinhados(_).
     */
    
    public static void main(String[] args) {
        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);
    }
}
