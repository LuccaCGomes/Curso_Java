package sec14.Heranca.PalavraChaveSuper;

public class PalavraChaveSuper {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Zelia", 4000);
        Gerente gerente = new Gerente("Alan", 10000, 1000);

        funcionario.exibirDetalhes();
        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());
        System.out.println(gerente.calcularBonus());
    }
}
