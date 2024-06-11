package superkeyword;

class Parent1{
    String name = "Jadhav";

    void farming(){
        System.out.println("Parent1 is farming sugarcane");
    }
}

class Child1 extends Parent1{
    String name = "Shubham Jadhav";

    void farming(){
        System.out.println("Child1 is farming tomato");
    }

    void display(){
        System.out.println(name);
        System.out.println(super.name);

        farming();
        super.farming();
    }
}

public class Child {
    public static void main(String[] args) {
        Child1 child = new Child1();

        //child.display();               


        //instanceof is a miscellaneous operator in java which is use to check whether the object belongs to particular hierarchy 
        //or not.;

        System.out.println(child instanceof Parent1);
        System.out.println(child instanceof Child1);
    }
}