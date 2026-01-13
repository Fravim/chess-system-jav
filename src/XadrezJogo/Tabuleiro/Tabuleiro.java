package XadrezJogo.Tabuleiro;

public class Tabuleiro {
    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Tabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.pecas = new Peca[linha][coluna];
    }

    public int getColuna() {
        return this.coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return this.linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Peca peca(int linha, int coluna) {
        return this.pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        return this.pecas[posicao.getLinha()][posicao.getColuna()];
    }
}
