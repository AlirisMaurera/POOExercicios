package desafioorientadoaobjetos.jogodavelha;

import java.util.Scanner;

public class Jogo {

    private JogoDaVelha jogoDaVelha;
    private Jogador jogador;
    private int vez=1, rodada = 1;
    private boolean verifica;
    public Scanner leitor = new Scanner(System.in);


    public Jogo() {
        this.jogoDaVelha = new JogoDaVelha();
        this.jogador = new Jogador();
        while (jogar());
    }

    private boolean jogar() {

        if (ganhador() == 1){
            if (vez == 1){
                System.out.println("\n***** Ganhador é o jogador 2 *****" );
            }else System.out.println("\n***** Ganhador é o jogador 1 *****" );
            jogoDaVelha.mostrarJogo();
            return false;
        }else if (ganhador() == -1){
            System.out.println("\n***** Empate *****");
            jogoDaVelha.mostrarJogo();
            return false;
        }else if(ganhador() == 0){

            do {
                System.out.printf("------- Rodada %d --------\n", rodada);
                jogoDaVelha.mostrarJogo();
                System.out.println("É a vez do jogador " + vez);
                System.out.print("Linha: ");
                int linha = leitor.nextInt();
                System.out.print("Coluna: ");
                int coluna = leitor.nextInt();

                int [] tentativa = {linha,coluna};
                jogador.setJogador(vez);
                jogador.setTentativa(tentativa);
                verifica = jogoDaVelha.incluirJogada(jogador);
            }while (!verifica);
            vez();
            rodada++;
            System.out.println();
            return true;
        }
        return false;
    }

    private void vez() {
        if (vez == 1){
            vez = 2;
        }else vez = 1;
    }


    private int ganhador(){
        if (jogoDaVelha.verificaLinha()){
            return 1;
        }else if (jogoDaVelha.verificaColuna()){
            return 1;
        }else if (jogoDaVelha.verificaDiagonal()){
            return 1;
        }else if (jogoDaVelha.verificaTabuleiroCompleto()){
            return -1;
        }else return 0;
    }
}



