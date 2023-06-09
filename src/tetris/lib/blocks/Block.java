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
        //construtor do componente
        super.paintComponent(gr); 
        draw(gr, 0, 0, getWidth() - 1, getHeight() - 1);
    }

    public void draw(Graphics gr, int px, int py, int width, int height) {
        //cor de preenchimento
        gr.setColor(mycolor);
        //preencher bloco
        gr.fill3DRect(px, py, width, height, true);
        //cor da linha
        gr.setColor(Color.BLACK);
        //desenhar a linha
        gr.draw3DRect(px, py, width, height, true);
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
    //    public Block() {
//        this(' ');
//    }


//    public Block(char ch) {
//        this.txt = ch;
//    }

}
