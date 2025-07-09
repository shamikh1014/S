
const url:string='https://jsonplaceholder.typicode.com/users';
const response=await fetch(url);
const json=await response.json();
console.log(json);