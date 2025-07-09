var arr = [10, 20, 30, 40]; // structur
var x = arr[0], y = arr[1];
console.log(x, y);
var z = arr[0];
var a = arr[0], b = arr[3];
console.log(a, b);
var obj = { id: 1001, name: 'Ram', city: 'Delhi' };
var id = obj.id, city = obj.city;
console.log(id, city);
var g = obj.id;
var g2 = obj.city;
function getElements(_a) {
    var x = _a[0], y = _a[1];
    console.log(x, y);
}
getElements(arr);
