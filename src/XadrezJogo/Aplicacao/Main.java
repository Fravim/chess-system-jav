package XadrezJogo.Aplicacao;

import XadrezJogo.Xadrez.XadrezPartida;

public class Main {
    public static void main(String[] args) {
        XadrezPartida xadrezPartida = new XadrezPartida();
        UI.printTabuleiro(xadrezPartida.getPecas());
    }
}
