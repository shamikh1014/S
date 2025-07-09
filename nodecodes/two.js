// Non Blocking

const fs=require('fs');
console.log('Current file path ', __filename);
fs.readFile(__filename, (error, buffer)=>{ // Async

    if(error){
        console.log('Error During File Read ', error);
    }
    else{
        console.log('File Content is ', buffer.toString());
    }

}); // Async 

for(let i=1;i<=10;i++){
    console.log('Value of i is ', i);
}