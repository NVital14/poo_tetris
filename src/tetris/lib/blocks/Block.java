/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author vital
 */  
public class Block extends JComponent {

    protected char txt;
    protected Color mycolor;

    public Block(){
        this(' ');
    }
    
    /**
     * Construtor por parâmetros
     *
     * @param ch caracter
     * @param color cor
     */
    
    public Block(char ch, Color color) {
        this.txt = ch;
        this.mycolor = color;
    }
    
    public Block(char ch) {
        this.txt = ch;
    }

    /**
     * Construtor cópia
     *
     * @param b bloco a copiar
     */
    public Block(Block b) {
        this(b.txt, b.mycolor);
    }

    @Override
    public void paintComponent(Graphics gr) {
        //size of component
        int sizeX = getWidth() - 1;
        int sizeY = getHeight() - 1;
        //draw component
        this.draw(gr, 0, 0, sizeX, sizeY);
    }

    public void draw(Graphics gr, int px, int py, int width, int height) {
        //color of fill
        gr.setColor(mycolor);
        //fill block
        gr.fillRect(px, py, width, height);
        //color of line
        gr.setColor(Color.BLACK);
        //draw line
        gr.drawRect(px, py, width, height);
    }

    //Encapsulamento
    public char getTxt() {
        return txt;
    }

    public void setTxt(char txt) {
        this.txt = txt;
    }

    public Color getMycolor() {
        return mycolor;
    }

    public void setMycolor(Color mycolor) {
        this.mycolor = mycolor;
    }

    @Override
    public String toString() {
        return String.valueOf(txt);
    }

    /**
     * Devolve um clone
     *
     * @return um objeto igual
     */
    public Block getClone() {
        return new Block(this);
    }

}