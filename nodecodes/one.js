var a=10; // Sync
var b=20; // Sync
var c=30; // Sync

console.log(c); // Sync

setTimeout(()=>{ // Async
    console.log("Hello After 3 sec");
}, 3000); // 3 sec

console.log("After setTimeout call"); // Sync