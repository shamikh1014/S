// Game Board
// Player Load, Cactus Load, Floor Load

import Cactus from "./cactus.js";

import { FRAME_RATE, GAME_HEIGHT, GAME_WIDTH, MAX, MIN } from "./config.js";

import Floor from "./floor.js";

import Player from "./player.js";


// 1. Draw a Canvas (Board)

// window (tab)

window.addEventListener('load', gameStart);

let player;
let context;
let floor;

function gameStart(){
    prepareCanvas();
    loadSprites();
    gameLoop();
}

function prepareCanvas(){

    const canvas=document.querySelector('#canvas');
    canvas.width=GAME_WIDTH;
    canvas.height=GAME_HEIGHT;

    context=canvas.getContext('2d');
    // canvas.style='border: 1px solid black';

}

function loadSprites(){

    player=new Player();
    floor= new Floor();

    loadCactus();

}

let cactusArray=[];
function loadCactus(){

    const cactusArr=['../assets/cactus1.png', '../assets/cactus2.png', '../assets/cactus1.png'];

    let GAP=1;

    for(var c of cactusArr){

        const cactus=new Cactus(GAME_WIDTH*GAP, GAME_HEIGHT, 48, 100, c);
        GAP++;
        cactusArray.push(cactus);

    }

}

function generateRandomNumber(){

    return Math.floor(Math.random()*MAX-MIN+1)+MIN;

}

var delay=0;
function generateRandomCactus(){

    if(delay>=70){

        delay=0;

        setTimeout(()=>{

            loadCactus();
            // cactusArray.push(new Cactus(GAME_WIDTH*1, GAME_HEIGHT, 48, 100, '../assets/cactus1.png'));
    
        }, generateRandomNumber());

    }

    delay++;

}

function printCactus(context){

    console.log('Cactus Array Size', cactusArray.length());

    for(let cactus of cactusArray){

        cactus.draw(context);

    }

}

function removeUnusedCactus(){

    cactusArray=cactusArray.filter(c=>!c.isOutOfScreen())

}

function gameLoop(){

    // console.log('Game Loop');

    clearScreen();

    player.draw(context);
    floor.draw(context);

    printCactus(context);
    generateRandomCactus();
    removeUnusedCactus();

    setTimeout(function(){

        requestAnimationFrame(gameLoop);

    }, FRAME_RATE)

}

function clearScreen(){

    context.fillStyle='white';
    context.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);

}






































// const canvas=document.querySelector('#canvas');
// console.log('Canvas is', canvas);

// canvas.width=300;
// canvas.height=300;
// canvas.style="border: 1px solid black";

// const context=canvas.getContext('2d');

// // Line

// context.moveTo(0, 0);
// context.lineTo(20, 300);
// context.stroke();

// // Rect

// context.fillStyle="green";
// // context.fillRect(10, 10, 150, 100);

// // Circle

// context.beginPath();
// context.arc(90, 50, 40, 0, 2*Math.PI);
// context.stroke();

// // Image

// const image=new Image();
// image.src='../images/skillrisers.png';
// context.drawImage(image, 0, 0, 100, 100);

// // Text

// context.font='20px Arial';
// context.fillStyle='red';
// context.fillText('Brain Mentors', 50, 50);