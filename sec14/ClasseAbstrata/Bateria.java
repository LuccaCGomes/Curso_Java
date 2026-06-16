package sec14.ClasseAbstrata;

public class Bateria extends InstrumentoMusical{
    
    public Bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a Bateria: " + nome);
    }


}
