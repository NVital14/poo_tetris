/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import tetris.lib.blocks.Empty;
import static tetris.lib.board.Difficulty.DIFFICULT;
import static tetris.lib.board.Difficulty.EASY;
import static tetris.lib.board.Difficulty.NORMAL;
import tetris.lib.definitions.ChosenColor;
import tetris.app.Music;

/**
 *
 * @author vital
 */
public final class TetrisGame extends Board {

    private Timer timer;
    private boolean canSkipPiece = true;
    private int explodedLines = 0;
    private int score = 0;
    private int delay;
    public Music music = new Music();
    private int freezedPieces = 0;

    /**
     * Construtor por defeito
     */
    public TetrisGame() {
        super();
    
    }
    public TetrisGame(int lines, int cols, Difficulty chosenLevel,
            ChosenColor colors) {
        super(lines, cols, colors);

        setLevel(chosenLevel);

        switch (getLevel()) {
            case EASY -> setDelay(300);
            case NORMAL -> setDelay(200);
            case DIFFICULT -> setDelay(100);
            default -> setDelay(300);
        }
        timer = new Timer();
        startGame(delay);
    }

    /**
     * Iniciar o jogo
     *
     * @param delay
     */
    public void startGame(int delay) {
        timer.schedule(new MoveGame(), 0, delay);
        music.startMusic();
    }

    /**
     * Termina o jogo
     */
    public void stopGame() {
        timer.cancel();
        //.........

    }

    //ENCAPSULAMENTO
    public boolean getCanSkipPiece() {
        return canSkipPiece;
    }

    public void setCanSkipPiece(boolean canSkipPiece) {
        this.canSkipPiece = canSkipPiece;
    }
    private boolean isGamePaused = false;

    public boolean getIsGamePaused() {
        return isGamePaused;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getFreezedPieces() {
        return freezedPieces;
    }

    public void setFreezedPieces(int freezedPieces) {
        this.freezedPieces = freezedPieces;
    }

    public int getExplodedLines() {
        return explodedLines;
    }

    public void setExplodedLines(int explodedLines) {
        this.explodedLines = explodedLines;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Pausa o jogo e recomeça o jogo a partir do momento em que estava antes de
     * fazer pause
     */
    public void pauseOrUnpauseGame() {
        //se a variável isGamePaused tiver o valor false, é porque o timer está ativo
        if (isGamePaused == false) {
            //cancela o timer (para o jogo)
            timer.cancel();
            //coloca a variável isGamePaused a true
            isGamePaused = true;
        } else {
            //cria novo timer
            timer = new Timer();
            //recomeça onde tinha parado
            timer.schedule(new MoveGame(), 0, delay);
            //coloca a variável isGamePaused a true
            isGamePaused = false;
        }
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
            music.allMusicStop();
            music.startDeletedLinesMusic();
            //aumenta o número de linhas rebentadas
            explodedLines++;
            //aumenta os popntos, conforme o nível de dificuldade
            switch (getLevel()) {
                case EASY -> score += 200;
                case NORMAL -> score += 250;
                default -> score += 300;
            }
            System.out.println("Score (deleteLines):" + score);
            System.out.println("linhas rebentadas: " + explodedLines);
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
                    music.allMusicStop();
                    setFocusable(false);
                } else if (canMovePiece(0, 1)) {
                    moveDown();
                } else {
                    freezePiece();
                    generatePiece();
                    freezedPieces++;
                    if (getLevel() == EASY) {
                        canSkipPiece = true;
                    } else if (getLevel() == NORMAL && freezedPieces == 5) {
                        canSkipPiece = true;
                        freezedPieces = 0;
                    } else if (getLevel() == DIFFICULT && freezedPieces == 10) {
                        canSkipPiece = true;
                        freezedPieces = 0;
                    }

                }

            }
            checkAndRemoveLines();

        }

    }

}
