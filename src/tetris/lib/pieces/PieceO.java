/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.pieces;

import java.awt.Color;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;

/**
 *
 * @author vital
 */
public class PieceO extends Piece {

    /**
     * Construtor por defeito
     */
    public PieceO() {
        super(new Block[][]{
            {new Block('O', Color.ORANGE),
                new Block('O', Color.ORANGE),},
            {new Block('O', Color.ORANGE),
                new Block('O', Color.ORANGE),},}, 0, 0);
    }

    /**
     * Construtor por parâmetros, que cria a peça com a cor escolhida pelo
     * utilizador
     *
     * @param color
     */
    public PieceO(Color color) {
        super(new Block[][]{
            {new Block('O', color),
                new Block('O', color),},
            {new Block('O', color),
                new Block('O', color),},}, 0, 0);
    }

}
