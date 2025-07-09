// Big File

const fs=require('fs');
const path='';
console.log('Before Read');

const readStream=fs.createReadStream(path, {highWaterMark:100});

readStream.on('data', (chunk)=>{
    console.log(chunk);
});

readStream.on('end', ()=>{
    console.log('read completed');
})

/*
fs.readFile(__filename, (error, buffer)=>{ // Async

    if(error){
        console.log('Error During File Read', error);
    }
    else{
        console.log('File Content is', buffer.toString());
    }

}); // Async 
*/

console.log('After Read');