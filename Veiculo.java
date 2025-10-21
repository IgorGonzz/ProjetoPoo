import java.util.Random;

public class Veiculo {
    int distancia;
    Random random;

    public Veiculo() {
        this.distancia = 0;
        this.random = new Random();
    }

    public void mover() {
        int velocidade = random.nextInt(3) + 1;
        distancia += velocidade;
    }

    public void mostrarNaPista(int distanciaMaxima) {
        for (int i = 0; i < distancia; i++) {
            System.out.print(" ");
        }
        System.out.print("V");
        System.out.println();

        for (int i = 0; i < distanciaMaxima; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}