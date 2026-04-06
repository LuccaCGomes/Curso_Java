public class TypeCasting {
    
    /**
     * - Casting Implícito (widening): Coverte automaticamente tipos menores para tipos maiores sem perda de dados
     *    Ex: int -> long
     * 
     * - Casting Explícito (Narrowing): Necessário ao converter tipos maiores para tipos menores, podendo ter perda de dados
     *    Ex: double -> int
     *    Para realizar um casting explícito é necessário especificar o tipo de destino entre parênteses
     */
    public static void main(String[] args) {

        //  ----- Casting Implícito -----

        System.out.println("Widening:");

        int numero1 = 42;
        System.out.println("Número 1 Original(int): " + numero1);

        long numeroLong = numero1;
        System.out.println("Número 1 Long: " + numeroLong);

        double numeroDouble = numero1;
        System.out.println("Número 1 Double: " + numeroDouble);



        //  ----- Casting Explícito -----

        System.out.println("\n\nNarrowing:");

        double numero2 = 27.42444444444444d;
        System.out.println("Número 2 Original(double): " + numero2);

        int numero2Int = (int) numero2; // Necessária a explicitação do tipo final desejado entre paranteses
        System.out.println("Número 2 int: " + numero2Int); //O valor decimal foi perdido 

        float numero2Float = (float) numero2;
        System.out.println("Número 2 Float: " + numero2Float); // Valores de casas decimais foram perdidas já que float é representado com menos bytes que o Double
    }
}
