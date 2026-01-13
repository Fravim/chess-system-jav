package XadrezJogo.Tabuleiro;

public class Posicao {
    private int linha;
    private int coluna;

    public Posicao(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
    }

    public int getLinha() {
        return this.linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return this.coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public String toString() {
        return this.linha + "," + this.coluna;
    }
}