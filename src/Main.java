public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Thor", 0, 0);
        System.out.println(heroi);

        heroi.getEstatisticasHeroi().setNumeroVitoria(5);
        heroi.getEstatisticasHeroi().setNumeroDerrota(2);
        heroi.atualizarNivel();
        System.out.println(heroi);

        heroi.getEstatisticasHeroi().setNumeroVitoria(25);
        heroi.getEstatisticasHeroi().setNumeroDerrota(3);
        heroi.atualizarNivel();
        System.out.println(heroi);

        heroi.getEstatisticasHeroi().setNumeroVitoria(45);
        heroi.getEstatisticasHeroi().setNumeroDerrota(12);
        heroi.atualizarNivel();
        System.out.println(heroi);

    }
}
