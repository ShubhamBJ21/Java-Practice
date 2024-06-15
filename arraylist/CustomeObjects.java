package arraylist;

import java.util.ArrayList;
import java.util.List;

class Student {

    String name;
    int age;
    int std;
    String school = "Pune Public School";
    String blood;
    String address;
    double fees;

    Student() {
        // no argument constructor
    }

    Student(String name, int age, int std, String blood, String address, double fees) {
        this.name = name;
        this.age = age;
        this.std = std;
        this.blood = blood;
        this.address = address;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Age: " + age + ", Std: " + std + ", Blood: " + blood + ", Address: " + address + ", Fees: " + fees + " ]";
    }
}

public class CustomeObjects {
    public static void main(String[] args) {
        List<Student> db = new ArrayList<>();

        db.add(new Student("Shubham", 22, 16, "-O", "Satara", 15000.0));
        db.add(new Student("Karan", 18, 12, "AB+", "Ghodegaon", 250000.0));
        db.add(new Student("Ajinkya", 21, 14, "A-", "Pune", 30000.0));

        System.out.println("Before sorting:");
        System.out.println(db);

        sortStudent(db);

        System.out.println("After sorting:");
        System.out.println(db);
    }

    static void sortStudent(List<Student> db){
        for(int i=0; i<db.size()-1; i++){
            for(int j=0; j<db.size()-i-1; j++){
                if(db.get(j).age > db.get(j+1).age){
                    Student temp = db.get(j);
                    db.set(j, db.get(j+1));
                    db.set(j+1, temp);
                }
            }
        }
    }
}