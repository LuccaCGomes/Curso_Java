package sec13;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    
    private int[] numerosEscolhidos = new int[6];
    private int[] resultadoSorteio = new int[6];


    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    public void realizarSorteio() {
        Random gerador = new Random();
        
        for (int i = 0; i < resultadoSorteio.length; i++) {
            resultadoSorteio[i] = gerador.nextInt(60) + 1;
        }

        Arrays.sort(numerosEscolhidos);
        Arrays.sort(resultadoSorteio);
    }

    private int contarAcertos() {
        int acertos = 0;
        for (int i = 0; i < numerosEscolhidos.length; i++) {
            for (int j = 0; j < resultadoSorteio.length; j++) {
                if (numerosEscolhidos[i] == resultadoSorteio[j]) {
                    acertos++;
                    break;
                }
            }
        }
        return acertos;
    }

    public void exibirResultado() {
        int acertos = contarAcertos();
        System.out.println("Números Escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números Sorteados: " + Arrays.toString(resultadoSorteio));
        System.out.println("Quantidade de Acertos: " + acertos);
    }


}
