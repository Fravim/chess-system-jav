package XadrezJogo.Xadrez;

import XadrezJogo.Tabuleiro.Peca;
import XadrezJogo.Tabuleiro.Tabuleiro;

public class XadrezPeca extends Peca {
    private Cor cor;

    public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return this.cor;
    }
}