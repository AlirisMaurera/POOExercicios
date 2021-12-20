package desafioorientadoaobjetos.jogodavelha;

public class Jogador {

    private int[] tentativa = new int[2];
    private int jogador;

    public Jogador() {
    }

    public Jogador(int jogador, int[] tentativa) {
        this.tentativa = tentativa;
        this.jogador = jogador;
    }

    public int[] getTentativa() {
        return tentativa;
    }

    public int getJogador() {
        return jogador;
    }

    public void setTentativa(int[] tentativa) {
        this.tentativa = tentativa;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

   }
