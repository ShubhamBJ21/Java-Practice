package arraylist;

import java.util.ArrayList;
import java.util.Collections;

class Bike implements Comparable<Bike> {
    String brand;
    double price;
    int mileage;
    String color;

    Bike(String brand, double price, int mileage, String color) {
        this.brand = brand;
        this.price = price;
        this.mileage = mileage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[Brand: " + brand + " Price: " + price + " Mileage: " + mileage + " Colour: " + color + " ]";
    }

    @Override
    public int compareTo(Bike b) {
        if (this.price > b.price) {
            return 1;                                //swap(object1, object2)
        } else if (this.price < b.price) {
            return -1;                               //do not swap
        } else {  
            return 0;                               //both are equal
        }
    }
}

public class BikeDriver {
    public static void main(String[] args) {
        ArrayList<Bike> bikeList = new ArrayList<>();

        bikeList.add(new Bike("Yamaha", 1500.0, 40, "Red"));
        bikeList.add(new Bike("Honda", 1200.0, 50, "Blue"));
        bikeList.add(new Bike("Suzuki", 1400.0, 45, "Green"));
        bikeList.add(new Bike("Ducati", 1800.0, 35, "Black"));

        System.out.println("Before sorting:");
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }

        Collections.sort(bikeList);

        System.out.println("\nAfter sorting by price:");
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }
    }
}
