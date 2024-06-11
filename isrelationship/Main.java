//multiple inheritance through classes 
//It is not possible to achieve multiple inheritence through class 

package isrelationship;

class Parent1{
    void farming(){
        System.out.println("Parent1 working in farm");
    }

    void fighting(){
        System.out.println("Parent1 is wrestler");
    }
}

class Parent2{
    void fighting(){
        System.out.println("Parent2 is fighter");
    }
}

public class Main extends Parent1{
    public static void main(String[] args) {
        Main main1 = new Main();
        main1.fighting();
    }
}
