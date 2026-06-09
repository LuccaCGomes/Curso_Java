package sec12.ExerciciosSec12;

public class ProdutoEletronico {
    
    private String nome;
    private double preco;
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia) {
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }

    public void exibirInfo() {
        System.out.println("\nProduto: " + nome + "\nPreço: " + preco + "\nGarantia: " + garantia + " meses\n");
    }

    private double calcularDesconto(double porcentagem) {
        return (this.preco * porcentagem) / 100;
    }

    public void aplicarDesconto (double desconto) {
        if (desconto <= 0 || desconto > 100) {
            System.out.println("Valor inválido");
        } else {
            double valorDoDesconto = calcularDesconto(desconto);
            this.preco -= valorDoDesconto;
            System.out.println("Preço Descontado em " + desconto + "%");
        } 
    }
}
