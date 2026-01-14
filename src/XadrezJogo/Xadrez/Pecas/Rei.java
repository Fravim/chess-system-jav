package XadrezJogo.Xadrez.Pecas;

import XadrezJogo.JogoTabuleiro.Tabuleiro;
import XadrezJogo.Xadrez.Cor;
import XadrezJogo.Xadrez.XadrezPeca;

public class Rei extends XadrezPeca {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public boolean[][] movimentosPossiveis() {
       boolean[][] aux = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];
       return aux;
    }

    @Override
    public void mover() {

    }

    @Override
    public String toString() {
        return "R";
    }
}
