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
public class PieceI extends Piece {

    public PieceI() {
        super(new Block[][]{
            {new Block('I', Color.RED),
                new Block('I', Color.RED),
                new Block('I', Color.RED),
                new Block('I', Color.RED),}},
                0, 0);
    }

}
