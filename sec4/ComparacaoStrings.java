package sec4;

public class ComparacaoStrings {
    public static void main(String[] args) {
        
        String texto1 = "Olá, mundo!";
        String texto2 = "Olá, mundo!";

        System.out.println(texto1 == texto2);


        String varStr1 = "Lorem Ipsun";
        String varStr2 = new String("Lorem Ipsun");

        System.out.println(varStr1 == varStr2);
        System.out.println(varStr1.equals(varStr2));
        }
}
