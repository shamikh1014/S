var arr:number[]=[10, 20, 30, 40]; // structur
var [x, y]=arr;
console.log(x, y);
var z=arr[0];
var [a,,,b]=arr;
console.log(a, b);

const obj={id:1001, name:'Ram', city:'Delhi'};
const {id, city}:{id:number, city:string}=obj;
console.log(id, city);
const g=obj.id;
const g2=obj.city;

function showDetails({name, city}:{name:string, city:string}){
    console.log('Name ', name, 'City ', city);
}
showDetails(obj);

function getElements([x, y]:number[]){
    console.log(x, y);
}
getElements(arr);