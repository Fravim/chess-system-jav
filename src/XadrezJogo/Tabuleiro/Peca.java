package XadrezJogo.Tabuleiro;

import XadrezJogo.Xadrez.Cor;

public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro, Cor cor) {
        this.tabuleiro = tabuleiro;
        this.posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }
}