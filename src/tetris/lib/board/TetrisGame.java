/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.util.Timer;
import java.util.TimerTask;
import tetris.lib.blocks.Empty;
import tetris.lib.pieces.Piece;

/**
 *
 * @author vital
 */
public final class TetrisGame extends Board {

    private Timer timer;

    public boolean canSkipPiece = true;


    /**
     * Construtor por defeito
     */
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
    /**
     * Iniciar o jogo
     *
     * @param delay
     */
    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0, delay);
    }

    /**
     * Termina o jogo
     */
    public void stopGame() {
        timer.cancel();
        //.........

    }

    /**
     * Verifica se o jogo já terminou
     *
     * @return true or false
     */
    public boolean isGameOver() {
        return current.getLine() == 0 //está no topo
                && !canMovePiece(0, 1); //não pode descer

    }

    /**
     * Verifica se a linha está preenchida na totalidade
     *
     * @param line
     * @return true or false
     */
    private boolean isLineFull(int line) {
        //percorre cada bloco da linha
        for (int x = 0; x < getColumns(); x++) {
            //verifica se o bloco é do tipo Empty
            if (matrix[line][x] instanceof Empty) {
                // se o bloco for do tipo Empty, então a célula não está toda preenchida
                return false;
            }
        }
        //nenhum bloco é do tipo Empty, pelo que a linha está toda preenchida
        return true;
    }

    /**
     * Elimina a linha
     *
     * @param line
     */
    private void deleteLine(int line) {
        // Percorre de cima para baixo a matrix, a partir da linha a ser removida
        for (int i = line; i > 0; i--) {
            // Copia a linha superior para a linha atual
            System.arraycopy(matrix[i - 1], 0, matrix[i], 0, matrix[i].length);
        }

    }

    /**
     * Verifica se há linhas preenchidas e se houver elimina essas linhas
     */
    private void checkAndRemoveLines() {
        //percorre as linhas 
        for (int y = 0; y < getLines(); y++) {
            //se a linha estiver preenchida
            if (isLineFull(y)) {
                //elimina a linha
                deleteLine(y);
            }
        }
    }

    /**
     *
     */
    public void skipPiece() {
        if (canSkipPiece == true) {
            clearBoard();
            generatePiece();
            canSkipPiece = false;
        }

    }

    private void clearBoard() {
        Empty emptyBlock = new Empty();
        for (int y = 0; y < current.getLines(); y++) {
            for (int x = 0; x < current.getColumns(); x++) {

                //colocar um clone da peça na matriz
                matrix[y][x]
                        = emptyBlock;

            }
        }
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
                    canSkipPiece = true;

                }

            }
            checkAndRemoveLines();

        }

    }

}
