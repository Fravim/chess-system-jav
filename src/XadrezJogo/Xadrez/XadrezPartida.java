package XadrezJogo.Xadrez;
import XadrezJogo.Pecas.Rei;
import XadrezJogo.Pecas.Torre;
import XadrezJogo.Tabuleiro.Posicao;
import XadrezJogo.Tabuleiro.Tabuleiro;
public class XadrezPartida {
    private Tabuleiro tabuleiro;
    public XadrezPartida() {
        tabuleiro = new Tabuleiro(8,8);
        setupInitial();
    }
    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] partida = new XadrezPeca[this.tabuleiro.getLinha()][this.tabuleiro.getColuna()];
        for(int i = 0; i < this.tabuleiro.getLinha(); ++i) {
            for(int j = 0; j < this.tabuleiro.getColuna(); ++j) {
                partida[i][j] = (XadrezPeca)this.tabuleiro.peca(i, j);
            }
        }
        return partida;
    }private void setupInitial() {
        tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BLACK), new Posicao(0,0));
        tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BLACK), new Posicao(7,0));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(5,3));
        tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(3,3));
    }
}