package sec14.interfaces.MultiplasInterfaces;

interface Imprimivel {
    void imprimir();
}

interface Salvavel {
    void salvar();

    default void instrucaoParaSalvar() {
        System.out.println("Deve apertar ctrl + s");
    }
}

public class Documento implements Imprimivel, Salvavel {

    private String documento;

    public Documento(String documento) {
        this.documento = documento;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo....\n\n" + documento);
    }

    @Override
    public void salvar() {
        System.out.println("Salvando documento");
    }
}
