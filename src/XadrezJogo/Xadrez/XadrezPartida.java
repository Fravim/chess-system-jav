package XadrezJogo.Xadrez;

import XadrezJogo.JogoTabuleiro.Peca;
import XadrezJogo.JogoTabuleiro.Posicao;
import XadrezJogo.JogoTabuleiro.Tabuleiro;
import XadrezJogo.JogoTabuleiro.TabuleiroException;
import XadrezJogo.Xadrez.Pecas.Rei;
import XadrezJogo.Xadrez.Pecas.Torre;

public class XadrezPartida {

    private int turno;
    private Cor jogadorAtual;
    private Tabuleiro tabuleiro;

    public XadrezPartida() {
        tabuleiro = new Tabuleiro(8, 8);
        turno = 1;
        jogadorAtual = Cor.WHITE;
        setupInitial();
    }

    public int getTurno() {
        return turno;
    }

    public Cor getJogadorAtual() {
        return jogadorAtual;
    }

    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] partida = new XadrezPeca[tabuleiro.getLinha()][tabuleiro.getColuna()];
        for (int i = 0; i < tabuleiro.getLinha(); i++) {
            for (int j = 0; j < tabuleiro.getColuna(); j++) {
                partida[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
            }
        }
        return partida;
    }

    public boolean[][] movimentosPossiveis(XadrezPosicao posicaoOrigem){
        Posicao posicao = posicaoOrigem.paraPosicao();
        validarPosicaoOrigem(posicao);
        return tabuleiro.peca(posicao).movimentosPossiveis();
    }

    public XadrezPeca movimentoXadrez(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino) {
        Posicao origem = posicaoOrigem.paraPosicao();
        Posicao destino = posicaoDestino.paraPosicao();

        validarPosicaoOrigem(origem);
        validarPosicaoDestino(origem, destino);

        Peca pecaCapturada = fazerMovimento(origem, destino);

        proximoTurno();

        return (XadrezPeca) pecaCapturada;
    }

    private Peca fazerMovimento(Posicao origem, Posicao destino) {
        Peca p = tabuleiro.removePeca(origem);
        Peca pecaCapturada = tabuleiro.removePeca(destino);
        tabuleiro.lugarPeca(p, destino);
        return pecaCapturada;
    }

    private void validarPosicaoOrigem(Posicao posicao) {
        if (!tabuleiro.temPeca(posicao)) {
            throw new XadrezException("Não existe peça na posição de origem.");
        }
        if (!tabuleiro.peca(posicao).existeAlgumMovimento()){
            throw new TabuleiroException("Não há movimentos possiveis para peça escolhida");
        }
        XadrezPeca p = (XadrezPeca)tabuleiro.peca(posicao);
        if (jogadorAtual != p.getCor()) {
            throw new XadrezException("A peça escolhida não é sua.");
        }

    }

    private void validarPosicaoDestino(Posicao origem, Posicao destino) {
        if (!tabuleiro.peca(origem).movimentoPosivel(destino)) {
            throw new TabuleiroException("A peça escolhida não pode se mover para posição de destino.");
        }

    }

    private void proximoTurno() {
        turno++;
        jogadorAtual = (jogadorAtual == Cor.WHITE) ? Cor.BLACK : Cor.WHITE;
    }

    private void lugarNovaPeca(char coluna, int linha, XadrezPeca peca) {
        tabuleiro.lugarPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
    }

    private void setupInitial() {
        lugarNovaPeca('c', 1, new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('c', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('d', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('e', 2, new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('e', 1, new Torre(tabuleiro, Cor.WHITE));
        lugarNovaPeca('d', 1, new Rei(tabuleiro, Cor.WHITE));

        lugarNovaPeca('c', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovaPeca('c', 8, new Torre(tabuleiro, Cor.BLACK));
        lugarNovaPeca('d', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovaPeca('e', 7, new Torre(tabuleiro, Cor.BLACK));
        lugarNovaPeca('e', 8, new Torre(tabuleiro, Cor.BLACK));
        lugarNovaPeca('d', 8, new Rei(tabuleiro, Cor.BLACK));
    }
}