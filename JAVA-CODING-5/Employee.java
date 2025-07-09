
// class (Noun)
// e.g Person, Student, Employee, Account, Customer
// Classname (PascalCase) e.g FullTimeEmployee
// SOLID
// S-SRP
// Object-GOD Class(hashCode), toString()

// class Employee extends Object{

// Encapsulation-Binding Data(Variables) and Methods int a single unit and that unit is called class
class Employee{

    // When Object is created then allocate the memory of Instance Variables
    // int id; // Default scope(with in the folder/package scope)
    // Data Hiding

    private int id; // private-with in the class scope
    private String name;
    private double salary;
    private String email;
    private String phone;
    private String city;
    private String jobDesc;
    private String managerName;
    private String companyName;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getJobDesc(){
        return jobDesc;
    }

    public void setJobDesc(String jobDesc){
        this.jobDesc = jobDesc;
    }

    public String getManagerName(){
        return managerName;
    }

    public void setManagerName(String managerName){
        this.managerName = managerName;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /*
    * Constructor-To initialize the instance variables
    * Constructor name is same as class name
    * Constructor never return anything
    */

    // {

    //     System.out.println("I am a Init Block and I call before constructor");
    //     System.out.println("Id "+id);;
    //     System.out.println("Name "+name);;
    //     System.out.println("Salary "+salary);

    // }

    Employee(){
        // This is a default constructor(No args) and every class has a default constructor(by default)
        // id=1111;
        // name="No Name";
        // salary=1111;
        companyName="Brain Mentors";
        System.out.println("I am a Default Constructor");
    }

    // Param Constructor
    Employee(int id, String name, double salary){
        this(); // Calling Default Constructor(Constructor Chaining)
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    // @Override
    // public String toString(){
    //     return "Id "+id+" Name "+name+" Salary "+salary+" Company "+companyName;
    // }

    // void Employee(){
    //     System.out.println("I am not a constructor I am a method");
    // }

    public void takeInput(int id, String name, double salary){

        // id=id; // Local var=Local var
        // Instance var=Local var

        if(id<=0 || salary<=0){
            System.out.println("Invalid Id or Invalid Salary");
            return;
        }

        if(name==null){
            System.out.println("Invalid Name");
        }

        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    // @Override
    // public int hashCode(){
    //     return 1;
    // }

    // public void printEmployee(){
    //     // this-this is a keyword(Current calling object reference)
    //     System.out.println("Id "+this.id+" Name "+name+" Salary "+salary+" Company Name "+companyName);
    // }

    @Override
    public String toString(){
        return "Id "+id+" Name "+name+" Salary "+salary+" Company "+companyName;
    }

}