class Employee{
    // private id:number;
    // private name:string;
    // constructor(id:number, name:string){
    //     this.id=id;
    //     this.name=name;
    // }
    // ShortHand
    constructor(private id:number, private name:string){
        // this.id=id;
        // this.name=name;
    }
    show():void{
        console.log(`Id ${this.id} Name ${this.name}`);
    }
}

var tom:Employee=new Employee(1001, "Tom");
tom.show();