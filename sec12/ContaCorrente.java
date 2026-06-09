package sec12;

public class ContaCorrente {
    
    private String titular;
    private double saldo;
    private double limiteSaque = 500.0;

    public ContaCorrente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Valor deve ser maior que zero");
        } else {
            saldo += deposito;
            System.out.println("R$" + deposito + " depositado na conta");
        }
    }

    public void sacar(double saque) {
        if (saque > limiteSaque) {
            System.out.println("Valor solicitado é maior que seu limite de saque\nLimite: R$" + limiteSaque);
        } else if (saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= saque;
            System.out.println("R$" + saque + " sacado da conta");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + "\nSaldo: " + String.format("%.2f", saldo));
    }

}
