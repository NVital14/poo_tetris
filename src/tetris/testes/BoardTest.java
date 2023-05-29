/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.testes;

import tetris.lib.board.Board;

/**
 *
 * @author vital
 */
public class BoardTest {
public static void main(String[] args) {
 Board b = new Board(10, 10);
 System.out.println("ORIGINAL \n" + b);
 for (int i = 0; i < 100; i++) {
 b.moveLeft();
 }
 b.moveLeft();
 System.out.println("Left \n" + b);
 for (int i = 0; i < 100; i++) {
 b.moveRight();
 }
 System.out.println("Right \n" + b);
 b.fallDown();
 System.out.println("FALL \n" + b);
 b.freezePiece();
 b.generatePiece();
 System.out.println("Random \n" + b);
}
  
}
