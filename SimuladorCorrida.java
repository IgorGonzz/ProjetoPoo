import java.util.Random;

public class SimuladorCorrida {
    static class Veiculo {
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

    public static void main(String[] args) {
        final int DISTANCIA_MAXIMA = 20;
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        boolean corridaTerminada = false;

        while (!corridaTerminada) {
            veiculo1.mover();
            veiculo2.mover();


            System.out.println("Veículo 1:");
            veiculo1.mostrarNaPista(DISTANCIA_MAXIMA);
            
            System.out.println("Veículo 2:");
            veiculo2.mostrarNaPista(DISTANCIA_MAXIMA);
            System.out.println("-------------------------------");


            if (veiculo1.distancia >= DISTANCIA_MAXIMA || veiculo2.distancia >= DISTANCIA_MAXIMA) {
                corridaTerminada = true;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (veiculo1.distancia > veiculo2.distancia) {
            System.out.println("Veículo 1 venceu a corrida!");
        } else if (veiculo2.distancia > veiculo1.distancia) {
            System.out.println("Veículo 2 venceu a corrida!");
        } else {
            System.out.println("A corrida terminou em empate!");

        
}
}
}