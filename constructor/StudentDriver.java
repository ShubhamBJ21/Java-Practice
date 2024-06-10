package constructor;

class Student{
    String name;
    int age;
    long contact;
    String address;

    Student(){
        //default constructor
    }

    //parameterized constructor
    Student(String name, int age, long contact, String address){
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;

        System.out.println("Data loaded successfully");
    }

    void showStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Contact: "+contact);
        System.out.println("Address: "+address);
    }
}

class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 21, 8830086429l, "Satara");

        s1.showStudentDetails();
    }
}