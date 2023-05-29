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

    public PieceJ() {
        super(new Block[][]{
            {new Block('J', Color.GREEN),
                new Block('J', Color.GREEN),
                new Block('J', Color.GREEN)},
            {new Empty(),
                new Empty(),
                new Block('J', Color.GREEN),},}, 0, 0);
    }
}
