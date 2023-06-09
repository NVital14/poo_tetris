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
public class PieceJ extends Piece {

    /**
     * Construtor por defeito
     */
    public PieceJ() {
        super(new Block[][]{
            {new Block('J', Color.GREEN),
                new Block('J', Color.GREEN),
                new Block('J', Color.GREEN)},
            {new Empty(),
                new Empty(),
                new Block('J', Color.GREEN),},}, 0, 0);
    }

    /**
     * Construtor por parâmetros, que cria a peça com a cor escolhida pelo
     * utilizador
     *
     * @param color
     */
    public PieceJ(Color color) {
        super(new Block[][]{
            {new Block('J', color),
                new Block('J', color),
                new Block('J', color)},
            {new Empty(),
                new Empty(),
                new Block('J', color),},}, 0, 0);
    }
}
