/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.app;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Bea⚝
 */
public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30];
    
    public Sound(){
        soundURL[0] = getClass().getResource("/resources/children-logo-116101.wav");
        soundURL[1] = getClass().getResource("/resources/futuristic-logo-3-versions-149429.wav");
        soundURL[2] = getClass().getResource("/resources/game-bonus-144751.wav");
        soundURL[3] = getClass().getResource("/resources/game-start-6104.wav");
        soundURL[4] = getClass().getResource("/resources/success-1-6297.wav");
        soundURL[5] = getClass().getResource("/resources/thunder-25689.wav");
        soundURL[6] = getClass().getResource("/resources/videogame-death-sound-43894.wav");
    }
    
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch(Exception e){
            
        }
    }
    
    public void play(){
        clip.start();
    }
    
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop(){
        clip.stop();
    }
}
