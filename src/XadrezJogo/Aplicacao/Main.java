package XadrezJogo.Aplicacao;
//a
import XadrezJogo.Xadrez.XadrezException;
import XadrezJogo.Xadrez.XadrezPartida;
import XadrezJogo.Xadrez.XadrezPeca;
import XadrezJogo.Xadrez.XadrezPosicao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        XadrezPartida xadrezPartida = new XadrezPartida();
        Scanner sc = new Scanner(System.in);
        List<XadrezPeca> capturadas = new ArrayList<>();

        while (true) {
            try {
                UI.limparTela();
                UI.printPartida(xadrezPartida, capturadas);
                System.out.println();
                System.out.print("Origem: ");
                XadrezPosicao origem = UI.lerXadrezPosicao(sc);

                boolean[][] movimentosPosiveis = xadrezPartida.movimentosPossiveis(origem);
                UI.limparTela();
                UI.printTabuleiro(xadrezPartida.getPecas(), movimentosPosiveis);

                System.out.println();
                System.out.print("Destino: ");
                XadrezPosicao destino = UI.lerXadrezPosicao(sc);

                XadrezPeca pecaCapturada = xadrezPartida.movimentoXadrez(origem, destino);
                if (pecaCapturada != null) {
                    capturadas.add(pecaCapturada);
                }


    }
            catch (XadrezException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
