package sec12;

public class Carro {

    /**
     * CLASSE
     * 
     * > Modelo que define as propriedades e comportamentos de um objeto,
     * como Atributos(propriedade, variável) e Métodos(comportamento, Função).
     * 
     * > São criadas usando a palavra "class". O nome da classe deve começar
     * com letra Maiúscula.
     * 
     * > A classe não faz nada por sí só até que seja instanciada(criando um objeto).
     */


    // =====================================
    // ATRIBUTOS (Propriedades/"Variáveis")
    // =====================================
    /**
     * > Os atributos são propriedades que definem as características de um objeto
     * 
     * > Cada propriedade tem um tipo de dado(int, string, boolean, etc, ...) e podem ser:
     * Public, private ou protected, dependendo da visibilidade desejada.
     * 
     * > Boas práticas de encapsulamento sugerem o uso de propriedades privadas com métodos
     * públicos para acessar e modificar os valores.
     * 
     * > Geralmente são declaradas no início da classe.
     */
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual = 0;
    boolean motorLigado = false;


    // ===========================
    // Constructors
    // ===========================
    /**
     * São métodos especiais para inicializar objetos. São chamados
     * automaticamente quando criamos um novo objeto.
     * 
     * O nome do construtor DEVE ser o MESMO que o nome da classe.
     * 
     * Eles não tem um tipo de retorno(nem mesmo void) e são utilizados
     * para atribuir valores iniciais aos atributos de um objeto.
     * 
     * Pode ter mais de um construtor, variando a quantidade de parâmetros;
     */

    public Carro() {
        this.marca = "Marca Exemplo";
        this.modelo = "Modelo Exemplo";
        this.ano = 1950;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }



    // ==========================
    // MÉTODOS (COMPORTAMENTOS)
    // ==========================
    /**
     * > Métodos são funções dentro de uma classe que definem o comportamento do
     * Objeto.
     * 
     * > Eles permitem que objetos realizem Ações ou Operações.
     */

    void acelerar() {
        System.out.println("Carro " + modelo + " " + marca + " Acelerando!");
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    void ligarMotor() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("Ligando Motor...");
        } else {
            System.out.println("Motor já estava ligado");
        }
    }

    void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("Desligando Motor...");
        } else {
            System.out.println("Motor já está desligado");
        }
    }

    void aumentarVelocidade(double incremento) {
        if (!motorLigado) {
            System.out.println("Necessário ligar o motor antes de acelerar");
        } else {
            velocidadeAtual += incremento;
            System.out.println("Acelerando....\nVelocidade Atual: " + velocidadeAtual + " KM/h");
        }
    }
    
}
