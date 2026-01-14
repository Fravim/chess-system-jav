package XadrezJogo.Xadrez;

import XadrezJogo.JogoTabuleiro.Peca;
import XadrezJogo.JogoTabuleiro.Tabuleiro;

public abstract class XadrezPeca extends Peca {
    private Cor cor;

    public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
        this.cor = cor;
    }

    public Cor getCor() {
        return this.cor;
    }

    public XadrezPosicao getXadrezPosicao() {
        return XadrezPosicao.daPosicao(posicao);
    }
}