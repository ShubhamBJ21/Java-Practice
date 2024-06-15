package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car {
    String brand;
    double price;
    int mileage;
    String color;

    Car(String brand, double price, int mileage, String color) {
        this.brand = brand;
        this.price = price;
        this.mileage = mileage;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString() {
        return "[Brand: " + brand + " Price: " + price + " Mileage: " + mileage + " Colour: " + color + "] ";
    }
}

public class CarDriver {
    public static void main(String[] args) {
        ArrayList<Car> car = new ArrayList<>();

        car.add(new Car("Mercedes", 7500000, 12, "Black"));
        car.add(new Car("Lamborgini", 12000000, 5, "Green"));
        car.add(new Car("Jaguar", 8500000, 9, "White"));

        System.out.println("-----------------------------");
        System.out.println("Sort car using price");
        sortByPrice(car);

        System.out.println("-----------------------------");
        System.out.println("Sort car using mileage");
        sortByPrice(car);
    }

    public static void sortByPrice(List<Car> car) {
        Comparator<Car> c1 = new Comparator<Car>() {

            public int compare(Car o1, Car o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(car, c1);

        for (Car sortCar : car) {
            System.out.println(sortCar);
        }
    }

    public static void sortByMileage(List<Car> car) {
        Comparator<Car> c1 = new Comparator<Car>() {

            public int compare(Car o1, Car o2) {
                if (o1.getMileage() > o2.getMileage()) {
                    return 1;
                } else if (o1.getMileage() < o2.getMileage()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        };

        Collections.sort(car, c1);

        for (Car sortCar : car) {
            System.out.println(sortCar);
        }
    }

}