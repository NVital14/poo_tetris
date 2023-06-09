/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author vital
 */
public class BlockMatrix extends JPanel implements Drawable {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, 0, 0, getWidth(), getHeight(),
                true
        );
    }

    @Override
    public void draw(Graphics gr, int px, int py, int width, int height,
            boolean paintEmpties
    ) {
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                if (!paintEmpties && matrix[y][x] instanceof Empty) {
                    continue;
                }

                matrix[y][x].draw(gr, px + x * sizeX, py + y * sizeY, sizeX,
                        sizeY);
            }
        }
    }
    protected Block[][] matrix;

    /**
     * Construtor com parâmetros Copia a matriz que vem no parÂmetro
     *
     * @param matrix
     */
    public BlockMatrix(Block[][] matrix) {
        int l = matrix.length;
        int c = matrix[0].length;
        this.matrix = new Block[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                this.matrix[i][j] = matrix[i][j].getClone();
            }
        }
    }

    /**
     * Construtor por defeito, cria um bloco vazio
     */
    public BlockMatrix() {
        this(new Block[][]{{new Empty()}});

    }

    /**
     * Construtor cópia
     *
     * @param blockMat
     */
    public BlockMatrix(BlockMatrix blockMat) {
        this(blockMat.matrix);
    }

    //ENCAPSULAMENTO
    public Block[][] getMatrix() {
        return matrix;
    }

    public int getLines() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    /**
     * Rodar a matriz para o lado direito
     */
    public void rotate() {
        Block[][] aux = new Block[getColumns()][getLines()];
        //transposta da matriz
        for (int l = 0; l < getLines(); l++) {
            for (int c = 0; c < getColumns(); c++) {
                aux[c][l] = matrix[l][c];
            }
        }
        //espelhar a matriz
        int laux = aux.length;
        int caux = aux[0].length;
        for (int l = 0; l < laux; l++) {
            for (int c = 0; c < caux / 2; c++) {
                Block temp = aux[l][c];
                aux[l][c] = aux[l][caux - c - 1];
                aux[l][caux - c - 1] = temp;
            }

        }
        //atualizar a matriz com a auxiliar
        matrix = aux;
    }

    /**
     * Colocar para texto
     *
     * @return matriz 2d de carateres
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getLines(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                str.append(matrix[i][j]);

            }
            str.append("\n");
        }
        return str.toString();

    }

    /**
     * Clonar a matriz
     *
     * @return clone do objeto
     */
    public BlockMatrix getClone() {
        return new BlockMatrix(this);
    }

}
