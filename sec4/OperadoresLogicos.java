package sec4;

public class OperadoresLogicos {
    
    public static void main(String[] args) {

    // =========================================================
    // AND (&&)
    //
    // Retorna true SOMENTE se ambas as condiçoes forem VERDADEIRAS
    // =========================================================

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false


    // =========================================================
    // OR (||)
    //
    // Retorna true se PELO MENOS uma das condições for VERDADEIRA
    // =========================================================

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false


    // =========================================================
    // NOT (!)
    //
    // Inverte o valor lógico. Retorna true se a condição for falsa e vice-versa.
    // =========================================================

        System.out.println(!true); // false
        System.out.println(!false); // true


    // Podemos combinar múltiplas condições em uma única expressão lógica

        System.out.println(true && !true); // false
        System.out.println(true && true || false); //true
        System.out.println(!(true || true)); //false
        System.out.println((true || true) && (true || false)); // true
    }
}
