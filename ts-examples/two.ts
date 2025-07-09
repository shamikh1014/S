var a:any;
a="Hello";
a=10;
a=true;
console.log('a ', a);
var b;
b=10;
b="Ok";
var c="Hello";
var e:undefined=undefined;
var g:null=null;
type mytype={id:number, name:string};
var h:mytype={id:1001, name:'Abc'};
var h2:mytype={id:1001, name:'Abc'};
function show(t:mytype):mytype{
    console.log(t);
    return t;
}
show({id:1001, name:'Tim'});