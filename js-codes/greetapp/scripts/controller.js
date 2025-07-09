
import { fullName as fn } from './model.js';

window.addEventListener('load', bind);

export function bind(){

    let button=document.getElementById('greetbt');
    button.addEventListener('click', takeInput); // Event binding
    document.getElementById('clearbt').addEventListener('click', clearAll);

}

export function takeInput(){

    let firstName=document.getElementById('first').value;
    let lastName=document.getElementById('last').value;
    output(firstName, lastName);

}

export const clearAll=()=>{

    document.getElementById('first').value='';
    document.getElementById('last').value='';
    document.getElementById('msg').innerText='';
    document.getElementById('first').focus();

}

const output=(firstName, lastName)=>
    document.getElementById('msg').innerText=`Welcome ${fn(firstName, lastName)}`;

// str=aMiT
// function titleCase(str){
//     let firstCap=str.charAt(0).toUpperCase(); // a
//     let rem=str.substring(1).toLowerCase();
//     return firstCap+rem;
// }