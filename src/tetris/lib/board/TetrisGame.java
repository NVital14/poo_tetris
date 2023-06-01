/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author vital
 */
public final class TetrisGame extends Board {

    Timer timer;

    public TetrisGame() {
        super();
        timer = new Timer();
        startGame(50);
    }

    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0, delay);
    }

    public void stopGame() {
        timer.cancel();
        //.........

    }

    public boolean isGameOVer() {
        return current.getLine() == 0 //esta no top
                && !canMovePiece(1, 0); //não pode descer

    }

    private class MoveGame extends TimerTask {

        @Override
        public void run() {
            requestFocus();
            if (isGameOVer()) {
                stopGame();
            } else if (canMovePiece(1, 0)) {
                moveDown();
            } else {
                freezePiece();
                generatePiece();

            }
        }

    }

}
