/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.testes;

import java.awt.Color;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.blocks.Empty;

/**
 *
 * @author vital
 */
public class BlockMatrixTest {
    
    public static void main(String[] args) {
 Block bl[][] = {
 {new Block('L', Color.BLUE), new Empty()},
 {new Block('L', Color.BLUE), new Empty()},
 {new Block('L', Color.BLUE), new Block('L', Color.BLUE)},};
 BlockMatrix b1 = new BlockMatrix(bl);
 BlockMatrix b2 = b1.getClone();

 System.out.println("b1\n" + b1);
 System.out.println("b2\n" + b2);

 System.out.println("N. Linhas " + b1.getLines());
 System.out.println("N. colunas " + b1.getColumns());

 b2.rotate();
 System.out.println("Original b1\n" + b1);
 System.out.println("Rotate b2\n" + b2);

}

    
}
