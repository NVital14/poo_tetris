/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Color;

/**
 *
 * @author vital
 */
public class Empty extends Block {

    /**
     * Construtor por defeito
     */
    public Empty() {
        super('.', Color.WHITE);
    }

    /**
     * Clonar um bloco
     *
     * @return um bloco empty
     */
    @Override
    public Block getClone() {
        return new Empty();
    }
}
