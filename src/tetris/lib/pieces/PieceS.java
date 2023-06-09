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
public class PieceS extends Piece {

    /**
     * Construtor por defeito
     */
    public PieceS() {
        super(new Block[][]{
            {new Empty(),
                new Block('S', Color.PINK),
                new Block('S', Color.PINK)},
            {
                new Block('S', Color.PINK),
                new Block('S', Color.PINK),
                new Empty(),},},
                0, 0);
    }

    /**
     * Construtor por parâmetros, que cria a peça com a cor escolhida pelo
     * utilizador
     *
     * @param color
     */
    public PieceS(Color color) {
        super(new Block[][]{
            {new Empty(),
                new Block('S', color),
                new Block('S', color)},
            {
                new Block('S', color),
                new Block('S', color),
                new Empty(),},},
                0, 0);
    }
}
