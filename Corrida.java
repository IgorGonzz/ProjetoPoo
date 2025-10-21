public class Corrida {
    private final int DISTANCIA_MAXIMA = 50;
    private Veiculo veiculo1;
    private Veiculo veiculo2;

    public Corrida() {
        this.veiculo1 = new Veiculo();
        this.veiculo2 = new Veiculo();
    }

    public void iniciar() throws InterruptedException {
        boolean corridaTerminada = false;

        while (!corridaTerminada) {
            veiculo1.mover();
            veiculo2.mover();

            System.out.println("Veículo 1:");
            veiculo1.mostrarNaPista(DISTANCIA_MAXIMA);
            
            System.out.println("Veículo 2:");
            veiculo2.mostrarNaPista(DISTANCIA_MAXIMA);
            System.out.println("---------------------------------------------------");

            if (veiculo1.distancia >= DISTANCIA_MAXIMA || veiculo2.distancia >= DISTANCIA_MAXIMA) {
                corridaTerminada = true;
            }

            Thread.sleep(200);
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