/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.testes;

import tetris.lib.pieces.Piece;
import tetris.lib.pieces.PieceL;
import tetris.lib.pieces.PieceT;

/**
 *
 * @author vital
 */
public class PieceLTest {
public static void main(String[] args) {
 Piece l = new PieceL();
 l.moveRight();
 System.out.println(l);
 Piece t = new PieceT();
 t.rotate();
 t.moveDown();
 System.out.println(t);


}
}
