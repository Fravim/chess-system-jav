package XadrezJogo.Xadrez.Pecas;

import XadrezJogo.JogoTabuleiro.Tabuleiro;
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
