//aggregation 
//lazy binding or dynamic binding      

//In lazy binding that the instance of the dependent object is not implicitly created with the help of non-static initializer
//instead a method is created and the refrence will created in the main object when the method is called execution.

package RelationShip;

class PenDrive{
    String brand;
    double price;
    double speed;
    double memory;

    PenDrive(){
        //no argument constructor
    }

    PenDrive (String brand, double price, double speed, double memory){
        this.brand = brand;
        this.price = price;
        this.speed = speed;
        this.memory = memory;

        System.out.println("PenDrive Created");
    }

    void showPenDrive(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Speed: "+speed);
        System.out.println("Memory: "+memory);
    }
}

class Computer{
    String brand;
    double price;
    int ram;
    int hd;
    String processor;

    PenDrive pen;

    Computer(){
        //no argument constructor
    }

    public Computer(String brand, double price, int ram, int hd, String processor){
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }

    void insertPenDrive(String brand, double price, double speed, double memory){
        pen = new PenDrive(brand, price, speed, memory);
        System.out.println("PenDrive inserted");
    }

    void showComputer(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("RAM: "+ram);
        System.out.println("HD: "+hd);
        System.out.println("Processor: "+processor);

        System.out.println("Computer is created");
    }
}

public class ComputerDriver {
    public static void main(String[] args) {
        Computer computer = new Computer("DEll", 45000, 8, 512, "I5");
        computer.showComputer();

        computer.insertPenDrive("SanDisk", 800, 4, 32);
        computer.pen.showPenDrive();
    }
}
