public class Heroi {

    private String nomeHeroi;
    private int numeroVitoria;
    private int numeroDerrota;
    private int saldoVitoria;
    private String nivelHeroi;

    public Heroi(String nomeHeroi, int numeroVitoria, int numeroDerrota, int saldoVitoria, String nivelHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.numeroVitoria = numeroVitoria;
        this.numeroDerrota = numeroDerrota;
        this.saldoVitoria = saldoVitoria;
        this.nivelHeroi = nivelHeroi;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public int getNumeroVitoria() {
        return numeroVitoria;
    }

    public void setNumeroVitoria(int numeroVitoria) {
        this.numeroVitoria = numeroVitoria;
    }

    public int getNumeroDerrota() {
        return numeroDerrota;
    }

    public void setNumeroDerrota(int numeroDerrota) {
        this.numeroDerrota = numeroDerrota;
    }

    public int getSaldoVitoria() {
        return saldoVitoria;
    }

    public void setSaldoVitoria(int saldoVitoria) {
        this.saldoVitoria = saldoVitoria;
    }

    public String getNivelHeroi() {
        return nivelHeroi;
    }

    public void setNivelHeroi(String nivelHeroi) {
        this.nivelHeroi = nivelHeroi;
    }

    @Override
    public String toString() {
        return "O Herói " + nomeHeroi + " tem saldo de " + saldoVitoria + " e está no nível de " + nivelHeroi;
    }

    

}
