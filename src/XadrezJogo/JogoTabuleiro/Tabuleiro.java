package XadrezJogo.JogoTabuleiro;
public class Tabuleiro {
    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Tabuleiro (int linha, int coluna) {
        if (linha < 1 || coluna < 1) {
            throw new TabuleiroException("Erro ao criar tabuleiro: é necessário pelo menos 1 linha e 1 coluna");
        }
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExiste(linha, coluna)) {
            throw new TabuleiroException("Posição não está no tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!posicaoExiste(posicao)) {
            throw new TabuleiroException("Posição não está no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void lugarPeca(Peca peca, Posicao posicao) {
        if (temPeca(posicao)) {
            throw new TabuleiroException("Já existe uma peça na posição " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    public Peca removePeca(Posicao posicao) {
        if (!posicaoExiste(posicao)) {
            throw new TabuleiroException("Posição não está no tabuleiro");
        }
        if (peca(posicao) == null) {
            return null;
        }
        Peca aux = peca(posicao);
        aux.posicao = null;
        pecas[posicao.getLinha()][posicao.getColuna()] = null;
        return aux;
    }


    private boolean posicaoExiste(int linha, int coluna) {
        return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
    }

    public boolean posicaoExiste(Posicao posicao) {
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
    }

    public boolean temPeca(Posicao posicao) {
        if (!posicaoExiste(posicao)) {
            throw new TabuleiroException("Posição não está no tabuleiro");
        }
        return peca(posicao) != null;
    }
}