package sec12.ExerciciosSec12;

public class Celular {
    
    String marca;
    String modelo;
    int bateria = 100;
    boolean ligado = false;


    public void ligarCelular() {
        if (ligado) {
            System.out.println("Celular já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Ligando o celular...");
        }
    }

    public void desligarCelular() {
        if (ligado) {
            this.ligado = true;
            System.out.println("Desligando Celular...");
        } else {
            
            System.out.println("Celular já está desligado!");
        }
    }

    public void mostrarBateria() {
        this.bateria -= 7;
        System.out.println("Bateria: " + bateria + "%");
    }

}
