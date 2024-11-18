
import { GAME_HEIGHT } from "./config.js";

export default class Floor{
    constructor(){

        this.x=0;
        this.y=GAME_HEIGHT-60;
        this.w=2400;
        this.h=24;
        
        this.image=new Image();
        this.image.src='../assets/floor.png';
        this.speed=SPEED;

    }

    draw(context){

        context.drawImage(this.image, this.x, this.y, this.h, this.w);
        context.drawImage(this.image, this.x+this.w, this.y, this.h, this.w);

        if(this.x < -this.w){
            this.x=0;
        }
        this.move();

    }

    move(){

        this.x=this.x-this.speed;

    }
    

}