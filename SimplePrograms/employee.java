class person {
    String name;
    int age;

    public person (String name, int age){
        this.name=name;
        this.age=age;

    }

    void displayDetails(){
        System.out.println("Name:\n" +name);
        System.out.println("Age:\n" +age);
    }


    
}

class Employee extends person {
    float salary;

    public Employee(String name, int age, float salary){
        super(name, age);
        this.salary=salary;
    }

    void displayEmployeeDetails(){
        super.displayDetails();
        System.out.println("Salary:\n" +salary);
    }

}

public class employee{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ram Sharma",25,25000);
        employee1.displayEmployeeDetails();
    }
}