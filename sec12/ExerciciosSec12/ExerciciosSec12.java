package sec12.ExerciciosSec12;

public class ExerciciosSec12 {

    public static void main(String[] args) {
        

        //Exercicio 1 - Criar Classe Celular
        /*
            Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria. 
            Implemente os métodos para ligar e desligar o celular, 
            e outro método que simule o consumo da bateria quando o celular é usado. 
            Crie a classe principal para instanciar dois objetos Celular 
            e testar os métodos criados.
        */

        Celular celular1 = new Celular();
        
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S23 FE";
        celular1.ligarCelular();
        celular1.mostrarBateria();
        celular1.desligarCelular();

        // Exercício 2 - Classe Aluno com encapsulamento e COnstrutores
        /*
            Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal. 
            Adicione um construtor parametrizado para inicializar essas propriedades e 
            implemente os setters e getters com validação para garantir
            que o nome não esteja vazio e a nota final esteja entre 0 e 100. 
            Na classe principal, crie dois objetos da classe Aluno, 
            atribua valores e exiba as informações.
        */

        Aluno aluno1 = new Aluno("André", "AL0001", 60);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
        aluno1.setNotaFinal(77);
        System.out.println(aluno1.getNotaFinal());



        // Exercício 3 - Classe ContaCorrente com Métodos e Encapsulamento
        /*
            Implemente uma classe ContaCorrente com as propriedades privadas titular, saldo e limiteSaque. 
            Crie os métodos para depositar(), sacar() e exibirSaldo(). 
            O método de saque deve verificar se o valor é menor ou igual ao limite de saque e se o saldo é suficiente. 
            Crie dois objetos da classe ContaCorrente e teste os métodos criados.
        */

        ContaCorrente conta1 = new ContaCorrente("Lucio", 100);
        ContaCorrente conta2 = new ContaCorrente("Fernando", 200);

        conta1.depositar(2432.75);
        conta2.sacar(152.1);
        conta2.sacar(100);
        conta1.sacar(1100);
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        
        // Exercício 4 - Classe ProdutoEletronico com Método dentro de Método
        /*
            Crie uma classe ProdutoEletronico com as propriedades nome, preco, e garantia. 
            Implemente um método para aplicar desconto no preço e, dentro desse método, 
            chame outro método que calcula o valor do desconto. 
            Crie um objeto da classe ProdutoEletronico, aplique o desconto 
            e exiba as informações após a alteração do preço.
        */

        ProdutoEletronico produto1 = new ProdutoEletronico("Câmera", 140.0, 6);

        produto1.exibirInfo();
        produto1.aplicarDesconto(10);
        produto1.exibirInfo();


        // Exercício 5 - Classe LivroBiblioteca com Lógica em Setters e Getters
        /*
            Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor, e disponivel (boolean). 
            Adicione métodos para pegar emprestado (definindo disponivel como false) 
            e devolver o livro (definindo disponivel como true). 
            Nos setters e getters, adicione a lógica para verificar se o livro está disponível 
            ou já emprestado antes de permitir a ação. 
            Na classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
        */

        LivroBiblioteca livro1 = new LivroBiblioteca("O Senhor dos Aneis", "J. R. R. Tolkien");
        LivroBiblioteca livro2 = new LivroBiblioteca("Piranesi", "Susanna Clarke");

        livro1.exibirInfo();
        livro2.exibirInfo();
        livro1.pegarEmprestado();
        livro1.exibirInfo();
        livro1.pegarEmprestado();
        livro2.devolver();
    }
}
