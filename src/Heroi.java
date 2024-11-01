public class Heroi {

    private String nomeHeroi;
    private EstatisticasHeroi estatisticasHeroi;
    private NivelHeroi nivelHeroi;
    
    public Heroi(String nomeHeroi,int numeroVitoria, int numeroDerrota) {
        this.nomeHeroi = nomeHeroi;
        this.estatisticasHeroi = new EstatisticasHeroi(numeroVitoria, numeroDerrota);
        this.nivelHeroi = new NivelHeroi(estatisticasHeroi.getSaldoVitoria());
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public EstatisticasHeroi getEstatisticasHeroi() {
        return estatisticasHeroi;
    }

    public NivelHeroi getNivelHeroi() {
        return nivelHeroi;
    }

    public void atualizarNivel() {
        this.nivelHeroi.atualizarNivel(estatisticasHeroi.getSaldoVitoria());
    }

    @Override
    public String toString() {
        return "O Herói " + nomeHeroi + " tem saldo de " + estatisticasHeroi.getSaldoVitoria() +
        " e está no nível " + nivelHeroi.getNivel();
    }

}