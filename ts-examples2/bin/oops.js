"use strict";
class Employee {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    show() {
        console.log(`Id ${this.id} Name ${this.name}`);
    }
}
var tom = new Employee(1001, "Tom");
tom.show();
