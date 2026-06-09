package sec12;

public class OrientacaoObjetos {
    
    /**
     * OBJETOS
     * 
     * > São instâncias de uma Classe.
     * 
     * > A Instância cria uma cópia do modelo da Classe em memória, que
     * seria o Objeto. Cada instancia(objeto) tem seus próprios valores
     * de atributos, independente de outros objetos.
     * > Além disso a instância permite acessar métodos e definir valores
     * para seus atributos.
     * 
     * > Para instanciar um objeto utilizamos a palavra "new".
     * > Sintaxe básica: NomeDaClasse nomeDoObjeto = new NomeDaClasse();
     */

    public static void main(String[] args) {
        
        // INSTANCIAÇÃO DA CLASSE
        Carro carro1 = new Carro();
        Pessoa pessoa1 = new Pessoa();
        Carro carro2 = new Carro("Fiat", "Uno", 1995);

        
        // ATRIBUINDO VALORES AOS ATRIBUTOS DO OBJETO
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fusca";
        carro1.ano = 1970;

        pessoa1.setNome("Alberto");
        pessoa1.setIdade(20);

        // ACESSANDO OS MÉTODOS DO OBJETO
        carro1.acelerar();
        carro1.exibirInfo();
        carro1.ligarMotor();
        carro1.aumentarVelocidade(50.0);
        carro1.aumentarVelocidade(20.0);
        System.out.println("\nNome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());
        carro2.exibirInfo();


        // =======================================
        // CLASSES IMUTÁVEIS
        // =======================================
        /**
         * São aquelas cujas instâncias (objetos) não podem ser modificadas
         * depois de criadas.
         * 
         * Todos os atributos da uma classe imutável são declarados como
         * private e final, portanto, não há setters e qualquer alteração nos
         * atributosrequer a criação de um novo objeto.
         * 
         * Com isso elas garantem consistência e segurança no código,
         * evitando mudanças inesperadas no estado do objeto.
         * 
         * Elas são particularmente úteis em programação multithread, pois eliminam
         * a necessidade de sincronização.
         */

        PessoaImutavel pessoaImutavel = new PessoaImutavel("Alice", 23);
        System.out.println(pessoaImutavel.getNome());
        System.out.println(pessoaImutavel.getIdade());    
    }


}
