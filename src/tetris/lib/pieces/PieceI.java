/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.pieces;

import java.awt.Color;
import tetris.lib.blocks.Block;

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
    
        public PieceI(Color color) {
        super(new Block[][]{
            {new Block('I', color),
                new Block('I', color),
                new Block('I', color),
                new Block('I', color),}},
                0, 0);
    }


}
