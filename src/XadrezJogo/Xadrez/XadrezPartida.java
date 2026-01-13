package XadrezJogo.Xadrez;

import XadrezJogo.Tabuleiro.Tabuleiro;

public class XadrezPartida {
    private Tabuleiro tabuleiro = new Tabuleiro(8, 8);

    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] partida = new XadrezPeca[this.tabuleiro.getLinha()][this.tabuleiro.getColuna()];

        for(int i = 0; i < this.tabuleiro.getLinha(); ++i) {
            for(int j = 0; j < this.tabuleiro.getColuna(); ++j) {
                partida[i][j] = (XadrezPeca)this.tabuleiro.peca(i, j);
            }
        }

        return partida;
    }
}