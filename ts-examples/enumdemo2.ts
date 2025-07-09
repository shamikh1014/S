/*
Enum to represent group of constants
TS Enum Can Store number or string

*/

function getDayValue(){
    return 12;
}

enum DBOperations{
    CREATE='C', UPDATE='U', STATUS='A',
}

enum Days{
    SUNDAY=10, MONDAY=11, TUESDAY=SUNDAY+MONDAY,
}
enum Choice{
    YES="y", NO="n",
}

var currentDay=Days.MONDAY;
if(10>2){
    currentDay=Days.SUNDAY;
}
console.log(typeof currentDay, currentDay);
switch(currentDay){
    case Days.SUNDAY:
        console.log('Holiday');
        break;
    case Days.MONDAY:
        console.log('Working Day');
    default:
        console.log('Invalid Day');
}