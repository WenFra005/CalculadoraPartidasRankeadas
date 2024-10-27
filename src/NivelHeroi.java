public class NivelHeroi {

    private String nivel;

    public NivelHeroi(int saldoVitoria) {
        atualizarNivel(saldoVitoria);
    }

    public String getNivel() {
        return nivel;
    }

    public void atualizarNivel(int saldoVitoria) {
        if (saldoVitoria <= 10) {
            this.nivel = "Ferro";
        } else if (saldoVitoria >= 11 && saldoVitoria <= 20) {
            this.nivel = "Bronze";
        } else if (saldoVitoria >= 21 && saldoVitoria <= 50) {
            this.nivel = "Prata";
        } else if (saldoVitoria >= 51 && saldoVitoria <= 80 ) {
            this.nivel = "Ouro";
        } else if (saldoVitoria >= 81 && saldoVitoria <= 90) {
            this.nivel = "Diamante";
        } else if (saldoVitoria >= 91 && saldoVitoria <= 100) {
            this.nivel = "Lendário";
        } else {
            this.nivel = "Imortal";
        }
    }
}
