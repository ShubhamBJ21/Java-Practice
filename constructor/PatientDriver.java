package constructor;

class Patient{
    String hospital = "Dhanvantari";
    String name ;
    int age;
    String gender ;
    String address;
    String bloodGroup ;
    int wardNo;
    String doc;

    protected Patient(){
        //default constructor
    }

    //parameterized constructor
    protected Patient(String name, int age, String gender, String address, String bloodGroup){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    //constructor overloading
    protected Patient(String name, int age, String gender, String address, String bloodGroup, int wardNo){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.wardNo = wardNo;
    }

    protected Patient(String name, int age, String gender, String address, String bloodGroup, int wardNo, String doc){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.wardNo = wardNo;
        this.doc = doc;
    }

    protected void displayPatient(){
        System.out.println("Hospital Name: "+hospital);        
        System.out.println("Name: "+name);        
        System.out.println("Age: "+age);        
        System.out.println("Gender: "+gender);        
        System.out.println("Address: "+address);        
        System.out.println("Blood Group: "+bloodGroup);        
        System.out.println("Ward No: "+wardNo);        
        System.out.println("Doctor: "+doc);            
    }

}

public class PatientDriver {
    public static void main(String[] args) {
        Patient p1 = new Patient("Chandra", 36, "female", "Nagar", "+AB", 12, "DR. Patil");

        p1.displayPatient();
    }
}
