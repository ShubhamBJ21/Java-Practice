//constructor chaining 
//   1)This call statement    2)super call statement


package constructor;

class Employee{
    String companyName = "MicroSoft";
    String name;
    int age;
    String address;
    String job;
    double salary;

    Employee(){
        //default constructor
    }

    Employee(String name, int age, String address, String job){
        this.name =  name;
        this.age  = age;
        this.address = address;
        this.job = job;
    }

    Employee(String name, int age, String address, String job, double salary){
        this(name, age, address, job);
        this.salary = salary;
    }

    void employeeDetails(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Job: "+job);
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shubham", 22, "Satara", "SDE-II", 5500000);
        e1.employeeDetails();
    }
}
