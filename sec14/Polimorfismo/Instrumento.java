package sec14.Polimorfismo;

abstract class Instrumento {
    protected String nome;
    
    public Instrumento(String nome) {
        this.nome = nome;
    }

    public abstract void tocar();


    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
}
