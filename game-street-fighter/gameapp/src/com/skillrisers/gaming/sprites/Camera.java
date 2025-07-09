
package com.skillrisers.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.gaming.canvas.Board;

public class Camera extends Sprite{

    public Camera(){

        x=11;
        y=300;
        w=1400;
        h=900;

        try{
            image=ImageIO.read(Board.class.getResource("bg2.jpg"));
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void move(){
        outOfScreen();

        if(moveBlock==1){
            speed=10;
        }
        else if(moveBlock==2){
            speed=-10;
        }

        x=x+speed;
    }

    public void outOfScreen(){
        System.out.println("Value of x "+x);

        if(x<=10){
            moveBlock=1; // No Move on Left
        }
        else if(x>=300-1400){ // No Move on Right
            moveBlock=2;
        }
        else{
            moveBlock=0; // Allow Both
        }

        // if(x>=3000-1400 || x<=10){
        //     speed=0;
        // }

    }

    @Override
    public BufferedImage defaultImage(){
        BufferedImage subImage=image.getSubimage(x, y, w, h);
        return subImage;
    }

}
