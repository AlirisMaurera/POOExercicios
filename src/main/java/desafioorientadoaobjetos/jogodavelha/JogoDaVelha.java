package desafioorientadoaobjetos.jogodavelha;

public class JogoDaVelha {

    private String[][] tabuleiro = new String[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j]= Status.VAZIO.getValor();
            }
        }
    }

    public void mostrarJogo(){
        for (int i = 0; i < 3; i++) {
            System.out.print("    ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
                if (j == 0 || j == 1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public boolean incluirJogada(Jogador jogador){

        if (validalinhaColuna(jogador.getTentativa())) {
            if (verificaJogada(jogador.getTentativa())) {
                int[] posicao = jogador.getTentativa();
                if (jogador.getJogador() == 1) {
                    this.tabuleiro[posicao[0]][posicao[1]] = Status.JOGADOR_1.getValor();
                } else this.tabuleiro[posicao[0]][posicao[1]] = Status.JOGADOR_2.getValor();

                return true;
            } else {
                System.out.println("jogada inválida, Campo já utilizado");
                return false;
            }
        }else {
            System.out.println("Jogada invalida, linha ou coluna deve estar entre 0 e 2");
            return false;
        }
    }

    private boolean validalinhaColuna(int[] tentativa) {
        if (tentativa[0] >=0 && tentativa[0] < 3 && tentativa[1] >=0 && tentativa[1] < 3){
           return true;
        }
        return false;
    }

    private boolean verificaJogada(int[] jogador){
        if (tabuleiro[jogador[0]][jogador[1]] == Status.VAZIO.getValor()){
            return true;
        }else return false;
    }



    public boolean verificaTabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == Status.VAZIO.getValor()){
                    return false;
                }
            }
          }
        return true;
    }

    public boolean verificaDiagonal() {
        if (tabuleiro[0][0]== Status.JOGADOR_1.getValor() && tabuleiro[1][1]== Status.JOGADOR_1.getValor() && tabuleiro[2][2]== Status.JOGADOR_1.getValor()){
            return true;
        }else if (tabuleiro[2][0]== Status.JOGADOR_1.getValor() && tabuleiro[1][1]== Status.JOGADOR_1.getValor() && tabuleiro[0][2]== Status.JOGADOR_1.getValor()) {
            return true;
        }
        if (tabuleiro[0][0]== Status.JOGADOR_2.getValor() && tabuleiro[1][1]== Status.JOGADOR_2.getValor() && tabuleiro[2][2]== Status.JOGADOR_2.getValor()){
            return true;
        }else if (tabuleiro[2][0]== Status.JOGADOR_2.getValor() && tabuleiro[1][1]== Status.JOGADOR_2.getValor() && tabuleiro[0][2]== Status.JOGADOR_2.getValor()) {
            return true;
        }
        return false;
    }

    public boolean verificaColuna() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i]== Status.JOGADOR_1.getValor() && tabuleiro[1][i]== Status.JOGADOR_1.getValor() && tabuleiro[2][i]== Status.JOGADOR_1.getValor()){
                return true;
            }else  if (tabuleiro[0][i]== Status.JOGADOR_2.getValor() && tabuleiro[1][i]== Status.JOGADOR_2.getValor() && tabuleiro[2][i]== Status.JOGADOR_2.getValor()){
                return true;
            }
        }
        return false;
    }

    public boolean verificaLinha() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0]== Status.JOGADOR_1.getValor() && tabuleiro[i][1]== Status.JOGADOR_1.getValor() && tabuleiro[i][2]== Status.JOGADOR_1.getValor()){
                return true;
            }else  if (tabuleiro[i][0]== Status.JOGADOR_2.getValor() && tabuleiro[i][1]== Status.JOGADOR_2.getValor() && tabuleiro[i][2]== Status.JOGADOR_2.getValor()){
                return true;
            }
        }
        return false;
    }

}
