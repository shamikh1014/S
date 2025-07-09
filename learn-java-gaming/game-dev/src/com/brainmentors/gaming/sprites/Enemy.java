
package com.brainmentors.gaming.sprites;

import javax.swing.ImageIcon;

public class Enemy extends Sprite{

    public Enemy(int x, int speed){

        this.x=x;
        this.speed=speed;
        y=30;
        w=200;
        h=200;

        image=new ImageIcon(Enemy.class.getResource("spider-enemy.gif"));

    }

    public void move(){
        
        if(y>900){
            y=0;
        }

        y=y+speed;

    }

}
