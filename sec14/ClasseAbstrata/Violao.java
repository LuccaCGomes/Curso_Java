package sec14.ClasseAbstrata;

public class Violao extends InstrumentoMusical{
/*
    Embora não haja herança propriamente dita, é necessário
    utilizar o extends para utilizar a classe abstrata
*/
    
    public Violao(String nome){
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando violão: " + nome);
    }
}
