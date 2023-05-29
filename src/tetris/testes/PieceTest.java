/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.testes;

import java.awt.Color;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.Empty;
import tetris.lib.pieces.Piece;

/**
 *
 * @author vital
 */
public class PieceTest {
    
    public static void main(String[] args) {
 Block[][] B = {
 {new Empty(), new Block('S', Color.PINK), new Block('S', Color.PINK)},
 {new Block('S', Color.PINK), new Block('S', Color.PINK), new Empty()}
 };
 Piece p = new Piece(B, 1, 4);
 System.out.println("piece = " + p);
 p.moveRight();
 p.rotate();
 System.out.println("Right and rotate " + p);
}
    
}
