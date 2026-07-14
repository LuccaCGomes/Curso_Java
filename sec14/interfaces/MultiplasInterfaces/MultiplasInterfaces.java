package sec14.interfaces.MultiplasInterfaces;

public class MultiplasInterfaces {
    public static void main(String[] args) {
        
        Documento documento = new Documento("Lorem Ipsum");
        documento.instrucaoParaSalvar();
        documento.salvar();
        documento.imprimir();
    }
}
