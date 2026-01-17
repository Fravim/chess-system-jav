package XadrezJogo.Xadrez.Pecas;

import XadrezJogo.JogoTabuleiro.Posicao;
import XadrezJogo.JogoTabuleiro.Tabuleiro;
import XadrezJogo.Xadrez.Cor;
import XadrezJogo.Xadrez.XadrezPeca;

public class Rei extends XadrezPeca {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] aux = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];
        Posicao p = new Posicao(0, 0);

        // Acima
        p.setValores(posicao.getLinha() - 1, posicao.getColuna());
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Abaixo
        p.setValores(posicao.getLinha() + 1, posicao.getColuna());
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Esquerda
        p.setValores(posicao.getLinha(), posicao.getColuna() - 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Direita
        p.setValores(posicao.getLinha(), posicao.getColuna() + 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Noroeste (NW) - Cima e Esquerda
        p.setValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Nordeste (NE) - Cima e Direita
        p.setValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Sudoeste (SW) - Baixo e Esquerda
        p.setValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Sudeste (SE) - Baixo e Direita
        p.setValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
        if (getTabuleiro().posicaoExiste(p) && podeMover(p)) {
            aux[p.getLinha()][p.getColuna()] = true;
        }

        return aux;
    }

    @Override
    public void mover() {

    }

    private boolean podeMover(Posicao posicao) {
        XadrezPeca p = (XadrezPeca)getTabuleiro().peca(posicao);
        return p == null || p.getCor() !=getCor();
    }



    @Override
    public String toString() {
        return "R";
    }
}
