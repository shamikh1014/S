
var buttons=document.getElementsByTagName('button');
console.log('Buttons are ', buttons);

for(var i=0;i<buttons.length;i++){
    var currentButton=buttons[i];
    currentButton.addEventListener('click', printXorZero);
}

var isGameEnd=false;
var flag=true;
var count=0;

function reset(){

    clearInterval(interval);
    countDown=5;

    isGameEnd=false;
    flag=true;
    count=0;

    for(var i=0;i<buttons.length;i++){
        buttons[i].innerText='';
    }

    document.getElementById('output').innerText='';

}

function isNotBlank(currentButton){

    console.log('This is my current button ', currentButton);
    console.log('This is current button text ', currentButton.innerText);

    return currentButton.innerText.trim().length>0;
    
}

function isThreeSame(first, second, third){
    if(isNotBlank(first) && isNotBlank(second) && isNotBlank(third)){

        return (first.innerText==second.innerText && first.innerText==third.innerText);
        
    }

    return false;

}

function isGameOver(){


    return isThreeSame(buttons[0], buttons[1], buttons[2]) ||
    isThreeSame(buttons[3], buttons[4], buttons[5]) ||
    isThreeSame(buttons[6], buttons[7], buttons[8]) ||

    isThreeSame(buttons[0], buttons[3], buttons[6]) ||
    isThreeSame(buttons[1], buttons[4], buttons[7]) ||
    isThreeSame(buttons[2], buttons[5], buttons[8]) ||
    
    isThreeSame(buttons[0], buttons[4], buttons[8]) ||
    isThreeSame(buttons[2], buttons[4], buttons[6]);

}

var countDown=5;
var interval;

function waitFor5Sec(){

    // Async

    console.log('Before Timeout');

    interval=setInterval(function(){

        document.getElementById('output').innerText=`Game Over and Game Resume in ${countDown} sec`;
        countDown--;
    }, 1000);

    setTimeout(reset, 6000);

    console.log('After Timeout');
    
}

function printXorZero(){

    // this-keyword
    // current calling object reference

    var currentButton=this;

    // <button> INNERTEXT </button>
    // alert("Clicked Happen");

    if(!isGameEnd && currentButton.innerText.trim().length==0){

        count++;
        var value=flag?"X":"0";
        currentButton.innerText=value;

        flag=!flag;

        if(count>4){
            if(isGameOver()){

                isGameEnd=true;
                // document.getElementById('output').innerText='Game Over and Game Resume in 5 sec';
                waitFor5Sec();

                // alert("Game Over");

            }

        }

    }
    

}