package XadrezJogo.JogoTabuleiro;

import XadrezJogo.Xadrez.Cor;

public abstract class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    private Cor cor;

    public Peca(Tabuleiro tabuleiro, Cor cor) {
        this.tabuleiro = tabuleiro;
        this.cor = cor;
        this.posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }
    public Cor getCor() {
        return cor;
    }

    public abstract boolean[][] movimentosPossiveis();
    public boolean movimentoPosivel(Posicao posicao) {
        return movimentosPossiveis() [posicao.getLinha()][posicao.getColuna()];
    }
    public boolean existeAlgumMovimento() {
        boolean[][] auxMovi = movimentosPossiveis();
        for (int i = 0; i < auxMovi.length; i++) {
            for (int j = 0; j < auxMovi[i].length; j++) {
                if (auxMovi[i][j] == true) {
                    return true;
                }
            }
        }
        return false;
    }
    public abstract void mover();
}