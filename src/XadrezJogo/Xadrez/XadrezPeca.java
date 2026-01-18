package XadrezJogo.Xadrez;

import XadrezJogo.JogoTabuleiro.Peca;
import XadrezJogo.JogoTabuleiro.Posicao;
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

    protected boolean aquiPecaOponente(Posicao posicao){
        XadrezPeca p = (XadrezPeca) getTabuleiro().peca(posicao);
        return p != null && p.getCor() != cor;
    }

    public XadrezPosicao getXadrezPosicao() {
        return XadrezPosicao.daPosicao(posicao);
    }
}