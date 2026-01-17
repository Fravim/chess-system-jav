package XadrezJogo.Aplicacao;
//a
import XadrezJogo.Xadrez.XadrezException;
import XadrezJogo.Xadrez.XadrezPartida;
import XadrezJogo.Xadrez.XadrezPeca;
import XadrezJogo.Xadrez.XadrezPosicao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        XadrezPartida xadrezPartida = new XadrezPartida();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                UI.limparTela();
                UI.printPartida(xadrezPartida);
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


    }
            catch (XadrezException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
