package XadrezJogo.Aplicacao;

import XadrezJogo.Xadrez.XadrezPartida;
import XadrezJogo.Xadrez.XadrezPeca;
import XadrezJogo.Xadrez.XadrezPosicao;

import java.util.Scanner;

public class Main {
//testeemail

    public static void main(String[] args) {
        XadrezPartida xadrezPartida = new XadrezPartida();
        Scanner sc = new Scanner(System.in);
        while (true) {
        UI.printTabuleiro(xadrezPartida.getPecas());
            System.out.println();
            System.out.print("Origem: ");
            XadrezPosicao origem = UI.lerXadrezPosicao(sc);
            System.out.println();
            System.out.print("Destino: ");
            XadrezPosicao destino = UI.lerXadrezPosicao(sc);

            XadrezPeca pecaCapturada = xadrezPartida.movimentoXadrez(origem, destino);
    }
    }
}
