/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.app;
import javax.sound.sampled.*;
import java.io.File;
/**
 *
 * @author vital
 */
public class Music {
    public Clip backgroundClip;
    public Clip deletedLineClip;

    public Music() {
        try {
            // Carregar os arquivos de áudio
            AudioInputStream backgroundMusic = AudioSystem.getAudioInputStream(new File("C:\\Users\\franc\\OneDrive\\Documents\\IPT\\POO\\TETRISFOLDER\\poo_tetris\\src\\tetris\\resources\\futuristic-logo-3-versions-149429.wav"));
            AudioInputStream lineClearedSound = AudioSystem.getAudioInputStream(new File("C:\\Users\\franc\\OneDrive\\Documents\\IPT\\POO\\TETRISFOLDER\\poo_tetris\\src\\tetris\\resources\\videogame-death-sound-43894.wav"));

            // Criar os objetos Clip
            backgroundClip = AudioSystem.getClip();
            deletedLineClip = AudioSystem.getClip();

            // Abrir os Clips e associar os arquivos de áudio
            backgroundClip.open(backgroundMusic);
            deletedLineClip.open(lineClearedSound);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void startMusic(){
        // Iniciar o som de fundo em loop contínuo
            backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
            backgroundClip.start();
    }

        
        public void allMusicStop(){
            // parar o som de fundo 
            backgroundClip.stop();
            // parar o som de apagar as linhas 
            deletedLineClip.stop();
        }
        
        public void startDeletedLinesMusic(){
            // Iniciar o som de apagar as linhas
            
            deletedLineClip.start();
            while(deletedLineClip.isRunning())
            // parar o som de fundo 
            startMusic();

        }
}
