/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.pieces;

import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.blocks.Empty;

/**
 *
 * @author vital
 */
public class Piece extends BlockMatrix {

    //posição no tabuleiro
    private int line;
    private int column;

    /**
     * Construtor
     *
     * @param mat matriz de blocos
     * @param linha line
     * @param coluna column
     */
    public Piece(Block[][] mat, int linha, int coluna) {

        super(mat);
        this.line = linha;
        this.column = coluna;

    }

    /**
     * Construtor cópia
     *
     * @param p peça a copiar
     */
    public Piece(Piece p) {
        this(p.matrix, p.line, p.column);

    }

    /**
     * Mover a peça para a esquerda
     */
    public void moveLeft() {
        this.column--;
    }

    /**
     * Mover a peça para a direita
     */
    public void moveRight() {
        this.column++;
    }

    /**
     * Mover a peça para baixo
     */
    public void moveDown() {
        this.line++;
    }

    /**
     * Fazer um clone da peça
     *
     * @return clone da peça
     */
    @Override
    public Piece getClone() {
        return new Piece(this);
    }

    //ENCAPSULAMENTO
    public int getLine() {
        return line;
    }

    public void setLine(int linha) {
        this.line = linha;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int coluna) {
        this.column = coluna;
    }

    /**
     * Calcula o comprimento da piece
     *
     * @return o maior x da matriz 
     */
    public int getPieceWidth() {
        int greatestX = -1;
        //Percorre a matriz da peça e verifica o maior x que não esteja empty
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                if (!(getMatrix()[y][x] instanceof Empty) && x > greatestX) {
                    greatestX = x;
                }
            }
        }
        return greatestX + 1;
    }

    /**
     * Calcula a altura da piece
     *
     * @return o maior y da matriz
     */
    public int getPieceHeight() {
        int greatestY = -1;
        //Percorre a matriz da peça e verifica o maior y que não esteja empty
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                if (!(getMatrix()[y][x] instanceof Empty) && y > greatestY) {
                    greatestY = y;
                }
            }
        }
        return greatestY + 1;
    }

    /**
     * Colocar para texto
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("piece = (");
        str.append(line);
        str.append(",");
        str.append(column);
        str.append(")\n");
        str.append(super.toString());
        return str.toString();
    }

}