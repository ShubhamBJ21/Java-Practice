//object creation
package objectclass;

class Laptop{

    String brand;
    int ram;
    int rom;
    double price;
    String processor;

    public void LaptopDetails(){
    System.out.println("Brand: "+brand);
    System.out.println("RAM: "+ram);
    System.out.println("ROM: "+rom);
    }
}

public class LaptopDriver{

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        
        l1.brand="Dell";
        l1.ram = 8;
        l1.rom = 250;
        l1.price = 420000;
        l1.processor = "Intel";

        l1.LaptopDetails();
    }   
}