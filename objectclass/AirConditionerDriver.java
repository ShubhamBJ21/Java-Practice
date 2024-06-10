//non static variable, methods, non static intializer

package objectclass;

class AirConditioner{

    String brand;
    String color;
    double price;
    int ambient;
    int maxTemp;
    int minTemp;

    {
        System.out.println("========Details of Air Conditioner=======");       
    }

    void increaseTemp(){
        if(ambient < maxTemp){
            ambient++;
        }else{
            System.out.println("Max temperature is reached.");
        }
    }

    void decreaseTemp(){
        if(ambient > minTemp){
            ambient--;
        }else{
            System.out.println("Min temperature is reached.");
        }
    }

    void showTemp(){
        System.out.println("Ambient temperature is: "+ambient);
    }

    void showAirConditionerDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Colour: "+color);
        System.out.println("Price: "+price);
        System.out.println("Ambient: "+ambient);
        System.out.println("Maximum temp: "+maxTemp);
        System.out.println("Minimum Temp: "+minTemp);
    }
}


public class AirConditionerDriver {
    public static void main(String[] args) {
        AirConditioner a1 = new AirConditioner();

        a1.brand = "Blue Star";
        a1.color = "White";
        a1.price = 65000;
        a1.ambient = 26;
        a1.maxTemp = 40;
        a1.minTemp = 9;

        a1.showAirConditionerDetails();
    }
}
