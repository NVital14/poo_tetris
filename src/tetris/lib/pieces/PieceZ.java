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
public class PieceZ extends Piece {

    public PieceZ() {
        super(new Block[][]{
            {
                new Block('Z', Color.MAGENTA),
                new Block('Z', Color.MAGENTA),
                new Empty(),},
            {new Empty(),
                new Block('Z', Color.MAGENTA),
                new Block('Z', Color.MAGENTA),},},
                0, 0);
    }
    
    public PieceZ(Color color) {
        super(new Block[][]{
            {
                new Block('Z', color),
                new Block('Z', color),
                new Empty(),},
            {new Empty(),
                new Block('Z', color),
                new Block('Z', color),},},
                0, 0);
    }
}
