public class OperadoresAritmeticos {
    
    /**
     * (+) Adição
     * (-) Subtração
     * (*) Multiplicação
     * (/) Divisão com resto
     * (%) Modulo (resto da divisão)
     * 
     * (++) Incremento -> ............ Incrementa valor da variável em 1
     * (--) Decremento -> ............ Decrementa valor da variável em 1
     * (+=) Atribuição Aditiva -> .... Soma e atribui o resultado a uma variável
     * (-=) Atribuição Subtrativa -> . Subtrai e atribui o resultado a uma variável
     */

    public static void main(String[] args) {
        
        //Adição
        System.out.println(3 + 4); // 7
        System.out.println(1.2 + 5); //6.2

        //Subtração
        System.out.println(6 - 2); // 4
        System.out.println(9.2f - 2); // 7.2

        //Multiplicação
        System.out.println(5 * 7); // 35
        System.out.println(3.5 * 9); // 31.5

        //Divisão (Para ter um resultado quebrado(ex: 2.7), pelo menos 1 numero da divisão tem que ser double)
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335
        System.out.println(10 / 3.0); // 3.3333333333333335

        //Módulo
        System.out.println(10 % 3); // 1
        System.out.println(10 % 3.1); // 0.6999999999999997

        // -.-.-.-.-.

        //Incremento
        int numInc = 5;
        numInc++;
        System.out.println(numInc); // 6

        //Decremento
        int numDec = 5;
        numDec--;
        System.out.println(numDec); // 4

        //Atribuição Aditiva
        int numAtrAdt = 5;
        numAtrAdt += 7;
        System.out.println(numAtrAdt); // 12

        //Atribuição Subtrativa
        int numAtrSub = 5;
        numAtrSub -= 4;
        System.out.println(numAtrSub); // 1
    }

}
