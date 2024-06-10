package constructor;

class TV{
    String brand = "LG";
    double price;
    double size;
    String color;

    {
        System.out.println("TV getting loaded");
        System.out.println(brand);
    }

    TV(){
        //default constructor
    }

    TV(double price, double size, String color){
        this.price = price;
        this.size = size;
        this.color = color;
    }

    void displayTV(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Size: "+size);
        System.out.println("Colour: "+color);
    }
}

public class TVDriver {
    public static void main(String[] args) {
        TV t2 = new TV();
        t2.displayTV();

        System.out.println("------------------");

        TV t1 = new TV(45000, 32, "Black");
        t1.displayTV();
    }
}
