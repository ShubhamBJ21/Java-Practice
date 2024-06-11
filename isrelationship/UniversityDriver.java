//Multi-Level Inheritance
//Inheritance achieved in more than one levle is known as multi-level inheritance

package isrelationship;

class University{
    String universityName;
    String universityLocation;
    String universityID;

    University(){
        //no argument constructor
    }

    University(String universityName, String universityLocation, String universityID){
        this.universityName = universityName;
        this.universityLocation = universityLocation;
        this.universityID = universityID; 
    }

    void showUniversityDetails(){
        System.out.println("University Name: "+universityName);
        System.out.println("University Location: "+universityLocation);
        System.out.println("University ID: "+universityID);
    }
}

class College extends University{
    String collegeName;
    String collegeAddress;
    String collegeID;

   College(String universityName, String universityLocation, String universityID,String collegeName, String collegeAddress, String collegeID){
    super(universityName, universityLocation, universityID);
    this.collegeName = collegeName;
    this.collegeAddress = collegeAddress;
    this.collegeID = collegeID;
   }

   void displayCollege(){
    showUniversityDetails();
    System.out.println("College Name: "+collegeName);
    System.out.println("College Address: "+collegeAddress);
    System.out.println("College ID: "+collegeID);
   }
}

class Department extends College{
    String deptName;
    String deptID;
    String HOD;

    Department(String universityName, String universityLocation, String universityID,String collegeName, String collegeAddress, String collegeID, String deptName, String deptID, String HOD){
        super(universityName, universityLocation, universityID, collegeName, collegeAddress, collegeID);
        this.deptName = deptName;
        this.deptID = deptID;
        this.HOD = HOD;
    }

    void displayDepartment(){
        displayCollege();
        System.out.println("Department Name: "+deptName);
        System.out.println("Department ID: "+deptID);
        System.out.println("HOD: "+HOD);
    }
}
public class UniversityDriver {
    public static void main(String[] args) {
        Department department = new Department("SPPU", "Pune", "UID001272", "Sinhad Academy of Engineering", "Kondhwa BK","COID005678", "Computer Engineering", "COMP021", "Shelke");
        department.displayDepartment();
    }    
}
