package sec6;

public class SobrecargaFuncao {
    public static void main(String[] args) {
        
        // =========================================================
        // Method Overloading
        // =========================================================

        /**
         * A sobrecarga de funções permite definir várias funções com o mesmo nome,
         * desde que tenham assinaturas diferentes(número de paramentros diferentes ou tipos
         * de parâmetros diferentes)
         * 
         * Com isso, permite criar diferentes versões de uma função para lidar com
         * tipos diferentes de dados ou quantidades diferentes de parâmetros.
         * 
         *  -- REGRAS
         * 
         *  - Nro de Parâmetros: As funções devem diferir no número de parâmetros
         *  - Tipo de Parâmetros: As funções podem ter o mesmo nro de parâmetros, DESDE QUE
         *    os tipos sejam diferentes;
         *  - Tipo de retorno: Não pode ser usado sozinho para diferenciar funçãos sobrecarregadas
         *
         */

        // Soma com 2 Inteiros
        System.out.println(soma(1, 3)); // 4

        // Soma com 3 Inteiros
        System.out.println(soma(4, 7, 1)); // 12

        // Soma com 2 Doubles
        System.out.println(soma(5.8, 9.1)); //14.8999

        
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
