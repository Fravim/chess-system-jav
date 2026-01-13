package XadrezJogo.Tabuleiro;

public class Tabuleiro {
    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Tabuleiro(int linha, int coluna) {
        if (linha < 1 || coluna < 1) {
            throw new TabuleiroException("Erro criando tabuleiro: é nescessario que tenha pelo menos uma linha e uma coluna");
        }
        this.linha = linha;
        this.coluna = coluna;
        this.pecas = new Peca[linha][coluna];
    }

    public int getColuna() {
        return this.coluna;
    }

    public int getLinha() {
        return this.linha;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExiste(linha, coluna)) {
            throw new TabuleiroException("Essa posição não está no tabuleiro");
        }
        return this.pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!posicaoExiste(posicao)) {
            throw new TabuleiroException("Essa posição não está no tabuleiro");
        }
        return this.pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void lugarPeca(Peca peca, Posicao posicao) {
        if (temPeca(posicao)) {
            throw new TabuleiroException("Já existe uma peça na posição " + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExiste(int linha, int coluna) {

        return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
    }
    public boolean posicaoExiste(Posicao posicao) {
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
    }
    public boolean temPeca(Posicao posicao) {
        return peca(posicao) != null;
    }
}
