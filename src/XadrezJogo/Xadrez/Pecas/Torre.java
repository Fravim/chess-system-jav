package XadrezJogo.Xadrez.Pecas;

import XadrezJogo.JogoTabuleiro.Posicao;
import XadrezJogo.JogoTabuleiro.Tabuleiro;
import XadrezJogo.Xadrez.Cor;
import XadrezJogo.Xadrez.XadrezPeca;

public class Torre extends XadrezPeca {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] aux = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];

        Posicao p = new Posicao(0,0);

        // Acima (Diminui a Linha)
        p.setValores(posicao.getLinha() - 1, posicao.getColuna());
        while (getTabuleiro().posicaoExiste(p) && !getTabuleiro().temPeca(p)){
            aux[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() - 1);
        }
        if (getTabuleiro().posicaoExiste(p) && aquiPecaOponente(p)){
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Abaixo (Aumenta a Linha)
        p.setValores(posicao.getLinha() + 1, posicao.getColuna());
        while (getTabuleiro().posicaoExiste(p) && !getTabuleiro().temPeca(p)){
            aux[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() + 1);
        }
        if (getTabuleiro().posicaoExiste(p) && aquiPecaOponente(p)){
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Esquerda (Diminui a Coluna)
        p.setValores(posicao.getLinha(), posicao.getColuna() - 1);
        while (getTabuleiro().posicaoExiste(p) && !getTabuleiro().temPeca(p)){
            aux[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() - 1);
        }
        if (getTabuleiro().posicaoExiste(p) && aquiPecaOponente(p)){
            aux[p.getLinha()][p.getColuna()] = true;
        }

        // Direita (Aumenta a Coluna)
        p.setValores(posicao.getLinha(), posicao.getColuna() + 1);
        while (getTabuleiro().posicaoExiste(p) && !getTabuleiro().temPeca(p)){
            aux[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() + 1);
        }
        if (getTabuleiro().posicaoExiste(p) && aquiPecaOponente(p)){
            aux[p.getLinha()][p.getColuna()] = true;
        }

        return aux;
    }

    @Override
    public void mover() {
    }

    @Override
    public String toString() {
        return "T";
    }
}