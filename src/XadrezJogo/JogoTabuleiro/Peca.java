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
}