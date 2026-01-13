package XadrezJogo.Pecas;

import XadrezJogo.Tabuleiro.Peca;
import XadrezJogo.Tabuleiro.Tabuleiro;
import XadrezJogo.Xadrez.Cor;
import XadrezJogo.Xadrez.XadrezPeca;

public class Torre extends XadrezPeca {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
}
