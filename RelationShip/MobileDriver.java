//composition
//early instantiation or static binding   ---> in this dependent object is implicitly created when 
//                                             object of main class is created.
package RelationShip;

class Battery{
    String brand;
    int cap;
    String type;
    int warranty;
    double price;

    Battery(){
        //not argument constructor
    }

    Battery(String brand, int cap, String type, int warranty, double price){
        this.brand = brand;
        this.cap = cap;
        this.type = type;
        this.warranty = warranty;
        this.price = price;

        System.out.println("Battery is created");
    }

    void showBattery(){
        System.out.println("Brand: "+brand);
        System.out.println("Capacity: "+cap);
        System.out.println("Type: "+type);
        System.out.println("Warranty: "+warranty);
        System.out.println("Price: "+price);
    }
}

class Mobile{
    String brand;
    double price;
    String color;

    //Battery bat = new Battery("samsung", 40000, "Li-on", 1, 2000);

    Battery bat;

    {
        bat = new Battery("samsung", 40000, "Li-on", 1, 2000);
    }

    Mobile(){
        //no argument constructor
    }

    Mobile(String brand, double price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;

        System.out.println("Mobile is created");
    }

    void displayMobile(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
    }
}

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 125000, "white");
        m1.displayMobile();
        m1.bat.showBattery();
    }
}
