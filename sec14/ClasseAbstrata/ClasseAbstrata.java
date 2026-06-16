package sec14.ClasseAbstrata;

public class ClasseAbstrata {
    /**
     * É uma classe que não pode ser instanciada diretamente. Ela
     * serve como um "modelo" para outras classes, definindo métodos
     * que as subclasses devem implementar.
     * 
     * As classes abstratas podem conter métodos:
     *      - Abstratos(sem implementação), que devem ser implementados
     *        pelas subclasses.
     *      - Concretos(com implementação), que podem ser herdados ou 
     *        sobrescritos.
     * 
     * A principal função de uma classe abstrata é fornecer uma estrutura
     * comum para subclasses, garantindo que elas implementem certos métodos 
     */

    public static void main(String[] args) {


        //Diferente da herança, aqui a sintaxe é => SUPERCLASSE variável = new SUBCLASSE(parametros)
        InstrumentoMusical violao = new Violao("Gianini");
        InstrumentoMusical bateria = new Bateria("Ludwig");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();
    }
}
