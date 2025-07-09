
package com.skillrisers.gaming.canvas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.skillrisers.gaming.sprites.Camera;
import com.skillrisers.gaming.sprites.KenPlayer;
import com.skillrisers.gaming.sprites.Power;
import com.skillrisers.gaming.sprites.PowerEffect;
import com.skillrisers.gaming.sprites.RyuPlayer;
import com.skillrisers.gaming.utils.GameConstants;
import com.skillrisers.gaming.utils.PlayerConstants;

public class Board extends JPanel implements GameConstants, PlayerConstants{

    BufferedImage imageBg;
    private RyuPlayer ryuPlayer;
    private KenPlayer kenPlayer;
    private Timer timer;
    private Power ryuPower;
    private Power kenPower;
    private boolean isGameOver;
    private Camera camera;

    private void loadPower(){
        ryuPower=new Power(20, "Ryu".toUpperCase());
        kenPower=new Power(GWIDTH/2+100, "Ken".toUpperCase());
    }

    private void paintPower(Graphics pen){
        ryuPower.printBox(pen);
        kenPower.printBox(pen);
    }

    public Board() throws IOException{

        camera=new Camera();
        // loadBackgroundImage();

        ryuPlayer=new RyuPlayer();
        kenPlayer=new KenPlayer();

        setFocusable(true);

        bindEvents();
        gameLoop();
        loadPower();

    }

    public void collision(){

        if(isCollide()){
            if(ryuPlayer.isAttacking()){
                kenPlayer.setCurrentMove(DAMAGE);
                kenPower.setHealth();
            }

            if(ryuPower.getHealth()<=0 || kenPower.getHealth()<=0){
                isGameOver=true;
            }

            ryuPlayer.setCollide(true);
            // System.out.println("Collide");
            ryuPlayer.setSpeed(0);

        }
        else{
            ryuPlayer.setSpeed(SPEED);
        }
    }

    private void printMessage(Graphics pen){
        pen.setColor(Color.RED);
        pen.setFont(new Font("times", Font.BOLD, 40));
        pen.drawString("Game Over", GWIDTH/2-50, GHEIGHT/2);
    }

    private boolean isCollide(){

        int xDistance=Math.abs(ryuPlayer.getX()-kenPlayer.getX());
        int yDistance=Math.abs(ryuPlayer.getY()-kenPlayer.getY());
        int maxW=Math.max(ryuPlayer.getW(), kenPlayer.getW());
        int maxH=Math.max(ryuPlayer.getH(), kenPlayer.getH());

        return xDistance<=maxW-40 && yDistance<=maxH;

    }

    private void gameLoop(){

        // Thread Trigger
        timer=new Timer(100, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                repaint();
                ryuPlayer.fall();
                collision();

            }
            
        });

        timer.start();

    }

    private void printPower(Graphics pen){
        for(PowerEffect power:ryuPlayer.getPowers()){
            power.printPower(pen);
        }
        
    }


    private void bindEvents(){

        this.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent e){
                ryuPlayer.setSpeed(0);
            }

            @Override
            public void keyPressed(KeyEvent e){

                // RYU
                if(e.getKeyCode()==KeyEvent.VK_LEFT){

                    ryuPlayer.setSpeed(-SPEED);
                    camera.setSpeed(-SPEED);
                    ryuPlayer.setCurrentMove(WALK);
                    ryuPlayer.move();
                    camera.move();
                    ryuPlayer.setCollide(false);
                    // repaint();

                }

                else if(e.getKeyCode()==KeyEvent.VK_RIGHT){

                    if(ryuPlayer.isCollide()){
                        ryuPlayer.setSpeed(0);
                        camera.setSpeed(0);
                    }
                    else{
                        ryuPlayer.setCollide(false);
                        ryuPlayer.setSpeed(SPEED);
                        camera.setSpeed(SPEED);
                    }
                    
                    ryuPlayer.setCurrentMove(WALK);
                    ryuPlayer.move();
                    camera.move();
                    // repaint();

                }

                else if(e.getKeyCode()==KeyEvent.VK_K){
                    ryuPlayer.setAttacking(true);
                    ryuPlayer.setCurrentMove(KICK);
                }

                else if(e.getKeyCode()==KeyEvent.VK_P){
                    ryuPlayer.setAttacking(true);
                    ryuPlayer.setCurrentMove(PUNCH);
                }

                else if(e.getKeyCode()==KeyEvent.VK_A){
                    ryuPlayer.setAttacking(true);
                    ryuPlayer.setCurrentMove(POWER_EFFECT);
                    ryuPlayer.addPower();
                }

                else if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    ryuPlayer.jump();
                }

                // KEN
                else if(e.getKeyCode()==KeyEvent.VK_J){

                    kenPlayer.setSpeed(-SPEED);
                    kenPlayer.move();
                    // repaint();
                    
                }

                else if(e.getKeyCode()==KeyEvent.VK_L){

                    kenPlayer.setSpeed(SPEED);
                    kenPlayer.move();
                    // repaint();
                    
                }

            }
            
        });

    }

    @Override
    public void paintComponent(Graphics pen){

        // Rendering/Painting
        super.paintComponent(pen);
        printBackgroundImage(pen);

        ryuPlayer.printPlayer(pen);
        kenPlayer.printPlayer(pen);
        
        paintPower(pen);
        printPower(pen);

        if(isGameOver){
            printMessage(pen);
            timer.stop();
        }

    }

    private void printBackgroundImage(Graphics pen){
        pen.drawImage(camera.defaultImage(), 0, 0, 1400, 900, null);
    }

    private void loadBackgroundImage(){

        try{
            imageBg=ImageIO.read(Board.class.getResource("bg2.jpg"));
        }
        catch(Exception ex){
            System.out.println("Background Image Loading Fail...");
            System.exit(0);
        }

    }

}
