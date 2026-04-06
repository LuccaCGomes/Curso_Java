public class TiposPrimitivos {

    public static void main(String[] args) {
        //Boolean
        boolean valor = true;
        System.out.println("Booleano: " + valor);


        // ----- Representação de Inteiros -----
        System.out.println("\n\n-*-* Representação de Inteiros *-*-");

        //Byte (Representação de Inteiros com 1 byte -> -128 à 127)
        byte numInteiroByte = 100;
        System.out.println("byte: " + numInteiroByte);

        //Short (Representação de Inteiros com 2 bytes -> -32.768 à 32.767)
        short numInteiroShort = -20321;
        System.out.println("short: " + numInteiroShort);

        //Int(Representação  de inteiros com 4 bytes)
        int numInteiroInt = 2543654;
        System.out.println("int: " + numInteiroInt);

        //Long (Representação de Inteiros com 8 bytes)
        long numInteiroLong = -5345873454888888836L;
        System.out.println("long: " + numInteiroLong);


        //Representação de Números fracionários
        System.out.println("\n\n-*-* Representação de Fracionários *-*-");

        //Float (Representação de fracionários com 4 bytes)
        float numFracFloat = 4.7665f;
        System.out.println("float: " + numFracFloat);

        //Double (Representação de Fracionários com 8 bytes)
        double numFracDouble = 43.7654765666d;
        System.out.println("double: " + numFracDouble);


        //Representação de Caracter(Para representar deve ser com aspas simples)
        char caracter = 'a';
        char simbolo = '$';
        System.out.println("\n\n-*-* Representação de Caracter *-*-\nchar: " + caracter + "\nOutro char: " + simbolo);

    }
}
