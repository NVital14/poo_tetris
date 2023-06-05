/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

/**
 *
 * @author vital
 */
public final class TetrisGame extends Board {

    Timer timer;

    public TetrisGame() {
        super();
        timer = new Timer();
        startGame(300);
    }

//    public TetrisGame(int lines, int cols) {
//        super(lines, cols);
//        timer = new Timer();
//        startGame(300);
//    }
    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0, delay);
    }

    public void stopGame() {
        timer.cancel();
        //.........

    }

    public boolean isGameOver() {
        return current.getLine() == 0 //esta no top
                && !canMovePiece(0, 1); //não pode descer

    }

    public boolean isLineFull(int line) {
        //verifica se a linha está cheia
        for (int x = 0; x < current.getColumns(); x++) {
            //verificar se existe algum bloco na linha que esteja vazio, se tiver retorna falso
            if (current.getMatrix()[line][x] instanceof Empty) {
                return false;
            }
        }
        //retorna verdadeiro, porque a linha está cheia
        return true;
    }

    public void deleteLine(int line) {

        // Percorra de cima para baixo a partir da linha a ser removida
        for (int i = line; i > 0; i--) {
            // Copie a linha superior para a linha atual
            System.arraycopy(matrix[i - 1], 0, matrix[i], 0, matrix[i].length);
        }
        // Limpe a primeira linha do tabuleiro
        Arrays.fill(matrix[0], false);

    }

    private class MoveGame extends TimerTask {

        @Override
        public void run() {
            requestFocus();
            if (!(current == null)) {
                if (isGameOver()) {
                    stopGame();
                } else if (canMovePiece(0, 1)) {
                    moveDown();
                } else {
                    freezePiece();
                    generatePiece();
                    if (isLineFull(current.getLine()) == true) {
                        deleteLine(current.getLine());
                    }

                }

            }

        }

    }

}
