package sec14.Polimorfismo;

public class Violino extends Instrumento {
    
    public Violino (String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Agora estamos tocando o " + nome);
    }
}
