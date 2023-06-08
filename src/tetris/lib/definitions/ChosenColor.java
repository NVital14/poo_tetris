/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.definitions;

import java.awt.Color;

/**
 *
 * @author vital
 */
public class ChosenColor {

    private Color IColor;
    private Color JColor;
    private Color OColor;
    private Color SColor;
    private Color LColor;
    private Color ZColor;
    private Color TColor;

    public ChosenColor(Color iC, Color jC, Color oC, Color sC, Color lC,
            Color zC, Color tC) {

        IColor = iC;
        JColor = jC;
        OColor = oC;
        SColor = sC;
        LColor = lC;
        ZColor = zC;
        TColor = tC;
    }

    public Color getIColor() {
        return IColor;
    }

    public void setIColor(Color IColor) {
        this.IColor = IColor;
    }

    public Color getJColor() {
        return JColor;
    }

    public void setJColor(Color JColor) {
        this.JColor = JColor;
    }

    public Color getOColor() {
        return OColor;
    }

    public void setOColor(Color OColor) {
        this.OColor = OColor;
    }

    public Color getSColor() {
        return SColor;
    }

    public void setSColor(Color SColor) {
        this.SColor = SColor;
    }

    public Color getLColor() {
        return LColor;
    }

    public void setLColor(Color LColor) {
        this.LColor = LColor;
    }

    public Color getZColor() {
        return ZColor;
    }

    public void setZColor(Color ZColor) {
        this.ZColor = ZColor;
    }

    public Color getTColor() {
        return TColor;
    }

    public void setTColor(Color TColor) {
        this.TColor = TColor;
    }

}
