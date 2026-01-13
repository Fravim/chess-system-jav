package XadrezJogo.Pecas;

import XadrezJogo.Tabuleiro.Tabuleiro;
import XadrezJogo.Xadrez.Cor;
import XadrezJogo.Xadrez.XadrezPeca;

import javax.swing.*;

public class Rei extends XadrezPeca {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
