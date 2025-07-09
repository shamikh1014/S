/*
Enum to represent group of constants
TS Enum Can Store number or string

*/
var Days;
(function (Days) {
    Days[Days["SUNDAY"] = 1] = "SUNDAY";
    Days[Days["MONDAY"] = 2] = "MONDAY";
})(Days || (Days = {}));
var currentDay = Days.MONDAY;
console.log(typeof currentDay, currentDay);
